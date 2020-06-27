package org.cannonerp.can_purshase_sell_service.Entities.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_element_element")
public class Element_element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    /*foring key a faire
    fk_source		int(11)
     */
    private String sourcetype;
    /*foring key a faire
    fk_target		int(11)
     */
    private String targettype;
}
