package Admin;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

        Admin findAdminByUserName(String username);
}
