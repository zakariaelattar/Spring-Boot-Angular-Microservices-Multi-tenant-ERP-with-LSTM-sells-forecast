package org.cannonerp.can_tiers_service.Entities.Cron;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
