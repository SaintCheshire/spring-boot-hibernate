package saint.cheshire.database.repository.country;

import saint.cheshire.entity.country.CountryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryTypeRepository extends JpaRepository<CountryType, Long> {

}
