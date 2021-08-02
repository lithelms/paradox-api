package cassiopeia.api;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends JpaRepository<Settings, UUID> {
}
