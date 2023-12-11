public interface RollenzuordnungRepository extends JpaRepository<Rollenzuordnung, Long> {
    List<Rollenzuordnung> findBySaeuleAndGueltigBisAfter(String saeule, LocalDate gueltigBis);
}
