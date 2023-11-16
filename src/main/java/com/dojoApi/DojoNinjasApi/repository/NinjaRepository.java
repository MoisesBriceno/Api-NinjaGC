package com.dojoApi.DojoNinjasApi.repository;
import com.dojoApi.DojoNinjasApi.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
