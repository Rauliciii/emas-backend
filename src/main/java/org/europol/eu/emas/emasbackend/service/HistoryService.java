package org.europol.eu.emas.emasbackend.service;


import org.europol.eu.emas.emasbackend.model.HistoryItem;

import java.util.List;

public interface HistoryService {
    HistoryItem saveHistoryItem(HistoryItem historyItem);

    List<HistoryItem> findHistoryItemsOfUser(Long userId);
}
