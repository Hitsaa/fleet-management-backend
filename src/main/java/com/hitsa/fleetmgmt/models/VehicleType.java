package com.hitsa.fleetmgmt.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
/** equal and hashcode methods are generated by lombok. (callSuper = false) means it does not call equals
 * and hashcode methods of parent class. here parent class is CommonObject so equals and hashcode methods of
 * this parent class will not be generated or called.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleType extends CommonObject {

}