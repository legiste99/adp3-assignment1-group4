package ac.za.cput.repository.impl; /**
 PlayerRepository.java
 Repository class for the Player
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ac.za.cput.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
}