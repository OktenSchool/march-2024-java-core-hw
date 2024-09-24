package models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@Table(name = "drive_licenses")
public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String series;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "driveLicense", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Owner owner;

    public DriveLicense(String series) {
        this.series = series;
    }
}
