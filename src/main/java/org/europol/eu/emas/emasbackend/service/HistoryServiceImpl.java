package org.europol.eu.emas.emasbackend.service;


import org.europol.eu.emas.emasbackend.model.HistoryItem;
import org.europol.eu.emas.emasbackend.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService{

    @Autowired
    private HistoryRepository historyRepository;

    @Override
    public HistoryItem saveHistoryItem(HistoryItem historyItem) {
        historyItem.setCreationTime(LocalDateTime.now());
        return historyRepository.save(historyItem);
    }

    @Override
    public List<HistoryItem> findHistoryItemsOfUser(Long userId) {
//        return historyRepository.findAllByHistoryOfUser(userId);
        return null;
    }

}
