/*
 * Created on Jul 10, 2004
 * by Kate Rhodes (masukomi at masukomi dot org)
 *
 */
package org.masukomi.aspirin.core;

import java.util.Collection;

import javax.mail.URLName;

import junit.framework.TestCase;
/**
 * <p>Test of DNS resolving.</p>
 *
 * @author masukomi (masukomi at masukomi dot org)
 *
 */
public class DNSJavaTest extends TestCase {

	public static void main(String[] args) {}

	/**
	 * DNS test with three problematic domains.
	 */
	public void testDNSLookup() {
		System.out.println("three problematic domains for MX Record retreival");

		final RemoteDelivery rd = new RemoteDelivery(new ThreadGroup("tempThreadGroup"));

		System.out.println("testing gmx.net");
		final Collection<URLName> mxRecords1 = rd.getMXRecordsForHost("gmx.net");
		assertNotNull(mxRecords1);
		assertTrue(mxRecords1.size() > 0);

		System.out.println("testing green.ch");
		final Collection<URLName> mxRecords2 = rd.getMXRecordsForHost("green.ch");
		assertNotNull(mxRecords2);
		assertTrue(mxRecords2.size() > 0);

		System.out.println("testing tschannen.cc");
		final Collection<URLName> mxRecords3 = rd.getMXRecordsForHost("tschannen.cc");
		assertNotNull(mxRecords3);
		assertTrue(mxRecords3.size() > 0);
	}

}
