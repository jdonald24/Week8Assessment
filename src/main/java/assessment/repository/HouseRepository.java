package assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import assessment.beans.House;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long>{

}
