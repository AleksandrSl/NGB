/*
 * MIT License
 *
 * Copyright (c) 2016 EPAM Systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) 
// Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 04:45:29 PM MSK 
//

package com.epam.catgenome.manager.externaldb.bindings.uniprot;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commentType", propOrder = { "molecule", "absorption", "kinetics", "phDependence", "redoxPotential",
        "temperatureDependence", "cofactor", "subcellularLocation", "conflict", "link", "event", "isoform",
        "interactant", "organismsDiffer", "experiments", "disease", "location", "text" })
public class CommentType {

    private static final String TEXT_FIELD_NAME = "text";

    protected MoleculeType molecule;
    protected CommentType.Absorption absorption;
    protected CommentType.Kinetics kinetics;
    protected CommentType.PhDependence phDependence;
    protected CommentType.RedoxPotential redoxPotential;
    protected CommentType.TemperatureDependence temperatureDependence;
    protected List<CofactorType> cofactor;
    protected List<SubcellularLocationType> subcellularLocation;
    protected CommentType.Conflict conflict;
    protected List<CommentType.Link> link;
    protected List<EventType> event;
    protected List<IsoformType> isoform;
    protected List<InteractantType> interactant;
    @XmlElement(defaultValue = "false")
    protected Boolean organismsDiffer;
    protected Integer experiments;
    protected CommentType.Disease disease;
    protected List<LocationType> location;
    protected List<EvidencedStringType> text;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "locationType")
    protected String locationType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "mass")
    protected Float mass;
    @XmlAttribute(name = "error")
    protected String error;
    @XmlAttribute(name = "method")
    protected String method;
    @XmlAttribute(name = "evidence")
    protected List<Integer> evidence;

    public MoleculeType getMolecule() {
        return molecule;
    }

    public void setMolecule(MoleculeType value) {
        this.molecule = value;
    }

    public CommentType.Absorption getAbsorption() {
        return absorption;
    }

    public void setAbsorption(CommentType.Absorption value) {
        this.absorption = value;
    }

    public CommentType.Kinetics getKinetics() {
        return kinetics;
    }

    public void setKinetics(CommentType.Kinetics value) {
        this.kinetics = value;
    }

    public CommentType.PhDependence getPhDependence() {
        return phDependence;
    }

    public void setPhDependence(CommentType.PhDependence value) {
        this.phDependence = value;
    }

    public CommentType.RedoxPotential getRedoxPotential() {
        return redoxPotential;
    }

    public void setRedoxPotential(CommentType.RedoxPotential value) {
        this.redoxPotential = value;
    }

    public CommentType.TemperatureDependence getTemperatureDependence() {
        return temperatureDependence;
    }

    public void setTemperatureDependence(CommentType.TemperatureDependence value) {
        this.temperatureDependence = value;
    }

    public List<CofactorType> getCofactor() {
        if (cofactor == null) {
            cofactor = new ArrayList<>();
        }
        return this.cofactor;
    }

    public List<SubcellularLocationType> getSubcellularLocation() {
        if (subcellularLocation == null) {
            subcellularLocation = new ArrayList<>();
        }
        return this.subcellularLocation;
    }

    public CommentType.Conflict getConflict() {
        return conflict;
    }

    public void setConflict(CommentType.Conflict value) {
        this.conflict = value;
    }

    public List<CommentType.Link> getLink() {
        if (link == null) {
            link = new ArrayList<>();
        }
        return this.link;
    }

    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<>();
        }
        return this.event;
    }

    public List<IsoformType> getIsoform() {
        if (isoform == null) {
            isoform = new ArrayList<>();
        }
        return this.isoform;
    }

    public List<InteractantType> getInteractant() {
        if (interactant == null) {
            interactant = new ArrayList<>();
        }
        return this.interactant;
    }

    public Boolean isOrganismsDiffer() {
        return organismsDiffer;
    }

    public void setOrganismsDiffer(Boolean value) {
        this.organismsDiffer = value;
    }

    public Integer getExperiments() {
        return experiments;
    }

    public void setExperiments(Integer value) {
        this.experiments = value;
    }

    public CommentType.Disease getDisease() {
        return disease;
    }

    public void setDisease(CommentType.Disease value) {
        this.disease = value;
    }

    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<>();
        }
        return this.location;
    }

    public List<EvidencedStringType> getText() {
        if (text == null) {
            text = new ArrayList<>();
        }
        return this.text;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String value) {
        this.locationType = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float value) {
        this.mass = value;
    }

    public String getError() {
        return error;
    }

    public void setError(String value) {
        this.error = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String value) {
        this.method = value;
    }

    public List<Integer> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<>();
        }
        return this.evidence;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"max", TEXT_FIELD_NAME})
    public static class Absorption {

        protected EvidencedStringType max;
        protected List<EvidencedStringType> text;

        public EvidencedStringType getMax() {
            return max;
        }

        public void setMax(EvidencedStringType value) {
            this.max = value;
        }

        public List<EvidencedStringType> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sequence" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="resource" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="EMBL-CDS"/>
     *                       &lt;enumeration value="EMBL"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="frameshift"/>
     *             &lt;enumeration value="erroneous initiation"/>
     *             &lt;enumeration value="erroneous termination"/>
     *             &lt;enumeration value="erroneous gene model prediction"/>
     *             &lt;enumeration value="erroneous translation"/>
     *             &lt;enumeration value="miscellaneous discrepancy"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "sequence" })
    public static class Conflict {

        protected CommentType.Conflict.Sequence sequence;
        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "ref")
        protected String ref;

        public CommentType.Conflict.Sequence getSequence() {
            return sequence;
        }

        public void setSequence(CommentType.Conflict.Sequence value) {
            this.sequence = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String value) {
            this.type = value;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String value) {
            this.ref = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="resource" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="EMBL-CDS"/>
         *             &lt;enumeration value="EMBL"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Sequence {

            @XmlAttribute(name = "resource", required = true)
            protected String resource;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "version")
            protected Integer version;

            public String getResource() {
                return resource;
            }

            public void setResource(String value) {
                this.resource = value;
            }

            public String getId() {
                return id;
            }

            public void setId(String value) {
                this.id = value;
            }

            public Integer getVersion() {
                return version;
            }

            public void setVersion(Integer value) {
                this.version = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dbReference" type="{http://uniprot.org/uniprot}dbReferenceType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "name", "acronym", "description", "dbReference" })
    public static class Disease {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String acronym;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected DbReferenceType dbReference;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getAcronym() {
            return acronym;
        }

        public void setAcronym(String value) {
            this.acronym = value;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String value) {
            this.description = value;
        }

        public DbReferenceType getDbReference() {
            return dbReference;
        }

        public void setDbReference(DbReferenceType value) {
            this.dbReference = value;
        }

        public String getId() {
            return id;
        }

        public void setId(String value) {
            this.id = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"km", "vmax", TEXT_FIELD_NAME})
    public static class Kinetics {

        @XmlElement(name = "KM")
        protected List<EvidencedStringType> km;
        @XmlElement(name = "Vmax")
        protected List<EvidencedStringType> vmax;
        protected List<EvidencedStringType> text;

        public List<EvidencedStringType> getKM() {
            if (km == null) {
                km = new ArrayList<>();
            }
            return this.km;
        }

        public List<EvidencedStringType> getVmax() {
            if (vmax == null) {
                vmax = new ArrayList<>();
            }
            return this.vmax;
        }

        public List<EvidencedStringType> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link {

        @XmlAttribute(name = "uri", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        public String getUri() {
            return uri;
        }

        public void setUri(String value) {
            this.uri = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {TEXT_FIELD_NAME})
    public static class PhDependence {

        @XmlElement(required = true)
        protected List<EvidencedStringType> text;

        public List<EvidencedStringType> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {TEXT_FIELD_NAME})
    public static class RedoxPotential {

        @XmlElement(required = true)
        protected List<EvidencedStringType> text;

        public List<EvidencedStringType> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {TEXT_FIELD_NAME})
    public static class TemperatureDependence {

        @XmlElement(required = true)
        protected List<EvidencedStringType> text;

        public List<EvidencedStringType> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }

    }

}
