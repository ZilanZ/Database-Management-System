package edu.northeastern.cs5200.cs5200fall2018zhang.hello;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Save and retrieve records from database
 *
 */
public interface HelloRepository extends JpaRepository<HelloObject, Integer> {
}
