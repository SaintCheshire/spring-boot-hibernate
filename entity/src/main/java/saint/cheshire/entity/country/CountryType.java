package saint.cheshire.entity.country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class CountryType {

    @Id
    @GeneratedValue
    @NonNull
    private Long id;

    @Column(unique = true, nullable = false)
    @NonNull
    private String type;

}
