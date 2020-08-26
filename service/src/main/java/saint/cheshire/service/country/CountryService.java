package saint.cheshire.service.country;

import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saint.cheshire.database.repository.country.CountryRepository;
import saint.cheshire.database.repository.country.CountryTitleRepository;
import saint.cheshire.database.repository.country.CountryTypeRepository;
import saint.cheshire.entity.country.Country;
import saint.cheshire.entity.country.CountryTitle;
import saint.cheshire.entity.country.CountryType;

import static saint.cheshire.database.repository.country.CountryRepository.titleContains;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CountryService {

    @NonNull
    private final CountryRepository countryRepository;
    @NonNull
    private final CountryTitleRepository countryTitleRepository;
    @NonNull
    private final CountryTypeRepository countryTypeRepository;

    @NonNull
    public Long saveCountry(@NonNull CountryTitle title, @NonNull CountryType type) {
        Country country = Country.builder()
                .id(0L)
                .title(title)
                .type(type)
                .build();

        return countryRepository.saveAndFlush(country).getId();
    }

    @NonNull
    public Long saveCountryTitle(@NonNull String title) {
        CountryTitle countryTitle = CountryTitle.builder()
                .id(0L)
                .title(title)
                .build();

        return countryTitleRepository.saveAndFlush(countryTitle).getId();
    }

    @NonNull
    public Long saveCountryType(@NonNull String type) {
        CountryType countryType = CountryType.builder()
                .id(0L)
                .type(type)
                .build();

        return countryTypeRepository.saveAndFlush(countryType).getId();
    }

    public boolean isCountryIdPresent(@NonNull Long id) {
        return countryRepository.existsById(id);
    }

    public boolean isCountryTitleIdPresent(@NonNull Long id) {
        return countryTitleRepository.existsById(id);
    }

    public boolean isCountryTypeIdPresent(@NonNull Long id) {
        return countryTypeRepository.existsById(id);
    }

    @NonNull
    public Country getCountryById(@NonNull Long id) {
        return countryRepository.findById(id).get();
    }

    @NonNull
    public CountryTitle getCountryTitleById(@NonNull Long id) {
        return countryTitleRepository.findById(id).get();
    }

    @NonNull
    public CountryType getCountryTypeById(@NonNull Long id) {
        return countryTypeRepository.findById(id).get();
    }

    @NonNull
    public List<Country> getCountryByTitle(@NonNull String title) {
        return countryRepository.findAll(titleContains(title));
    }

}
