@Entity
@Table(name = "rollenzuordnung")
public class Rollenzuordnung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vorname;
    private String nachname;
    private String benutzerkennung;
    private String rolle;
    private String saeule;
    private LocalDate gueltigBis;

    // Getter und Setter
}
