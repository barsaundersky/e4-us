package br.com.contabo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CNDTB40_DMST_IRRE_PARC_CCF database table.
 * 
 */
@Entity
@Table(name="CNDTB40_DMST_IRRE_PARC_CCF")
@NamedQuery(name="TB40Model.findAll", query="SELECT c FROM TB40Model c")
public class TB40Model implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CNDTB40_DMST_IRRE_PARC_CCF_CODGDMSTPARCCCFISCALSEQC_GENERATOR", sequenceName="CNDTB40_SEQC")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CNDTB40_DMST_IRRE_PARC_CCF_CODGDMSTPARCCCFISCALSEQC_GENERATOR")
	@Column(name="CODG_DMST_PARC_CCFISCAL_SEQC")
	private long codgDmstParcCcfiscalSeqc;

	@Column(name="CNDTB32_CODG_DMST_IRRE_SIST")
	private BigDecimal cndtb32CodgDmstIrreSist;

	@Column(name="CODG_PARC_IRREGULAR")
	private BigDecimal codgParcIrregular;

	public TB40Model() {
	}

	public long getCodgDmstParcCcfiscalSeqc() {
		return this.codgDmstParcCcfiscalSeqc;
	}

	public void setCodgDmstParcCcfiscalSeqc(long codgDmstParcCcfiscalSeqc) {
		this.codgDmstParcCcfiscalSeqc = codgDmstParcCcfiscalSeqc;
	}

	public BigDecimal getCndtb32CodgDmstIrreSist() {
		return this.cndtb32CodgDmstIrreSist;
	}

	public void setCndtb32CodgDmstIrreSist(BigDecimal cndtb32CodgDmstIrreSist) {
		this.cndtb32CodgDmstIrreSist = cndtb32CodgDmstIrreSist;
	}

	public BigDecimal getCodgParcIrregular() {
		return this.codgParcIrregular;
	}

	public void setCodgParcIrregular(BigDecimal codgParcIrregular) {
		this.codgParcIrregular = codgParcIrregular;
	}

}