package org.europol.eu.emas.emasbackend.repository.projection;


import org.europol.eu.emas.emasbackend.model.Type;

import java.time.LocalDateTime;

public interface HistoryResult {

    String getName();
    Type getType();
    Double getPrice();
    String getColor();
    LocalDateTime getCreationTime();

}
