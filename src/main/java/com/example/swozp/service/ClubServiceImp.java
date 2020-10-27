package com.example.swozp.service;

import com.example.swozp.model.Club;
import com.example.swozp.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClubServiceImp {
//    @Autowired
    private ClubRepository repository;
//    public List<Club> findAll(String keyword){
//        if(keyword != null){
//            return repository.findByClubName(keyword);
//        }
//        return repository.findAll();
//    }
    public void save (Club club){
        repository.save(club);
    }

    public Club get(long id){
        return repository.findById(id).get();
    }

    public void delete(long id){
        repository.deleteById(id);
    }

}
