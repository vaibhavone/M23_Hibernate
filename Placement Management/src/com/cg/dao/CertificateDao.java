package com.cg.dao;

import com.cg.entities.Certificate;

public interface CertificateDao {
	
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int cert_id);
	public abstract Certificate deleteCertificate(int cert_id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();



}

