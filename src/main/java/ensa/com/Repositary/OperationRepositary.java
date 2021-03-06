package ensa.com.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ensa.com.entity.Operation;
@Repository
@Component
@CrossOrigin("*")
public interface OperationRepositary extends JpaRepository<Operation,Long> {

}
