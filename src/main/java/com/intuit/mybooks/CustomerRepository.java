package com.intuit.mybooks;

import com.intuit.mybooks.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository  // to tell spring that this class will have Crud operations

// Jpa Repository interface gives us all basic functions which get implements by default SimpleJPARepository
//Customer is the table which it gonna play with , Long is primary key type here

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByEmail(String email);
}
