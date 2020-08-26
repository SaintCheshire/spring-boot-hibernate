package saint.cheshire.database.repository.country;

import lombok.NonNull;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import saint.cheshire.entity.country.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>, JpaSpecificationExecutor<Country> {

    @NonNull
    static Specification<Country> titleContains(@NonNull String title) {
        return (country, cq, cb) -> cb.like(
                country.get("title").get("title"), "%" + title + "%"
        );
    }

}
