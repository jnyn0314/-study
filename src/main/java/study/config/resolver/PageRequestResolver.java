package study.config.resolver;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import study.ApiResponse.exception.InvalidPageException;
import study.validation.review.ValidPage;

public class PageRequestResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(ValidPage.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) {
        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
        String pageStr = request.getParameter("page");

        int page;
        try {
            page = Integer.parseInt(pageStr);
        } catch (Exception e) {
            throw new InvalidPageException(); // 값이 없거나 숫자 변환 불가
        }

        if (page < 1) throw new InvalidPageException(); // 0 이하 → 에러

        return PageRequest.of(page - 1, 10); // 1-based → 0-based 변환
    }
}