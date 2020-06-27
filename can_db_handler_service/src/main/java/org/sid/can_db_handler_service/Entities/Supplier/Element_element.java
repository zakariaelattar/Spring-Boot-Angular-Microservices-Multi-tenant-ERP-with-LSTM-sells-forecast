package org.sid.can_db_handler_service.Entities.Supplier;
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
