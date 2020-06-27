package org.sid.can_db_handler_service.Entities.Cron;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_cronjob")
public class Cronjob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
}
