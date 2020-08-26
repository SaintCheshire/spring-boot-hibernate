package saint.cheshire.database.repository.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saint.cheshire.entity.country.CountryTitle;

@Repository
public interface CountryTitleRepository extends JpaRepository<CountryTitle, Long> {

}
