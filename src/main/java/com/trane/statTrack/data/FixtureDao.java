package com.trane.statTrack.data;

import com.trane.statTrack.model.Fixture;

import java.util.List;

public interface FixtureDao {
  List<Fixture> findAll();
  Fixture findById(Long id);
  void save(Fixture fixture);
  void delete(Fixture fixture);

}
