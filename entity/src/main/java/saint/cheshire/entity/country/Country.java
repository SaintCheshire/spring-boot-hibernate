package saint.cheshire.entity.country;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Country {

    @Id
    @GeneratedValue
    @NonNull
    private Long id;

    @ManyToOne(optional = false)
    @NonNull
    private CountryTitle title;

    @ManyToOne(optional = false)
    @NonNull
    private CountryType type;

}
