package study.repository.storeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
    boolean existsByNameAndAddress(String name, String address);
}