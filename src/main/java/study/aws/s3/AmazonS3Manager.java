package study.aws.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import study.config.AmazonConfig;
import study.domain.UuidEntity;
import study.repository.UuidRepository;

import java.io.IOException;

@Slf4j
@Component
@RequiredArgsConstructor
public class AmazonS3Manager {

    private final AmazonS3 amazonS3;
    private final AmazonConfig amazonConfig;
    private final UuidRepository uuidRepository;

    public String uploadFile(String keyName, MultipartFile file) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(file.getSize());

        try {
            amazonS3.putObject(
                    new PutObjectRequest(
                            amazonConfig.getBucket(),  // 버킷 이름
                            keyName,                   // 저장될 파일명
                            file.getInputStream(),     // 파일 데이터
                            metadata                   // 메타데이터
                    )
            );
        } catch (IOException e) {
            log.error("error at AmazonS3Manager uploadFile : {}", (Object) e.getStackTrace());
            throw new RuntimeException("S3 업로드 실패", e);
        }

        // 업로드된 파일의 URL 반환
        return amazonS3.getUrl(amazonConfig.getBucket(), keyName).toString();
    }

    public String generateReviewKeyName(UuidEntity uuid) {
        return amazonConfig.getReviewPath() + '/' + uuid.getUuid();
    }

    public void deleteFile(String fileUrl) {
        try {
            String fileKey = extractKeyFromUrl(fileUrl);
            amazonS3.deleteObject(bucketName, fileKey);
        } catch (Exception e) {
            throw new IllegalArgumentException("파일 삭제 실패", e);
        }
    }

    private String extractKeyFromUrl(String fileUrl) {
        // 버킷 이름 이후의 경로를 추출
        String bucketUrl = "https://" + bucketName + ".s3.amazonaws.com/";
        return fileUrl.replace(bucketUrl, "");
    }


}
