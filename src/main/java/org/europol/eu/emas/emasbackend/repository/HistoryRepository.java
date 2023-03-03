package org.europol.eu.emas.emasbackend.repository;


import org.europol.eu.emas.emasbackend.model.HistoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryItem, Long> {

//    @Query("select " +
//            "d.name as name, d.type as type, p.price as price, p.color as color, p.creationTime as creationTime" +
//            "from History p left join Submission d on d.id = p.submissionId" +
//            "where p.userId = :user_id")
//    List<HistoryItem> findAllByHistoryOfUser(@Param("user_id") Long id);

}
