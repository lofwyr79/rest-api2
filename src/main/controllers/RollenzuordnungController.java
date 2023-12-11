@RestController
@RequestMapping("/api/rollenzuordnungen")
public class RollenzuordnungController {

    @Autowired
    private RollenzuordnungRepository rollenzuordnungRepository;

    @GetMapping("/{saeule}")
    public List<Rollenzuordnung> getRollenzuordnungen(@PathVariable String saeule) {
        LocalDate currentDate = LocalDate.now();
        return rollenzuordnungRepository.findBySaeuleAndGueltigBisAfter(saeule, currentDate);
    }

    @PostMapping
    public Rollenzuordnung addRollenzuordnung(@RequestBody Rollenzuordnung rollenzuordnung) {
        return rollenzuordnungRepository.save(rollenzuordnung);
    }
}
