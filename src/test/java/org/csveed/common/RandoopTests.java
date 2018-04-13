import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class RandoopTests {
    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.csveed.common.Column column0 = null;
        try {
            org.csveed.common.Column column1 = new org.csveed.common.Column(column0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        java.lang.String str8 = column0.getExcelColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = org.csveed.common.Column.FIRST_COLUMN_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column4);
        int int7 = column1.getColumnIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.csveed.common.Column column1 = new org.csveed.common.Column("A");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        org.csveed.common.Column column9 = new org.csveed.common.Column();
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        int int11 = column9.compareTo(column10);
        column9.setColumnName("");
        org.csveed.common.Column column15 = new org.csveed.common.Column(10);
        int int16 = column9.compareTo(column15);
        org.csveed.common.Column column17 = column15.nextLine();
        int int18 = column3.compareTo(column17);
        org.csveed.api.Header header19 = null;
        org.csveed.common.Column column20 = column3.setHeader(header19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(column20);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column(column0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.String str5 = column0.toString();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Column Name: " + "'", str5.equals("Column Name: "));
        org.junit.Assert.assertNotNull(column7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        java.lang.String str1 = column0.getColumnName();
        java.lang.Class<?> wildcardClass2 = column0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        java.lang.String str6 = column0.getColumnText();
        java.lang.String str7 = column0.getExcelColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " index 1 (A) name \"\"" + "'", str6.equals(" index 1 (A) name \"\""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        int int6 = column5.getColumnIndex();
        org.csveed.common.Column column7 = new org.csveed.common.Column();
        org.csveed.common.Column column8 = new org.csveed.common.Column();
        int int9 = column7.compareTo(column8);
        column7.setColumnName("");
        org.csveed.common.Column column12 = column7.nextColumn();
        org.csveed.api.Header header13 = null;
        org.csveed.common.Column column14 = column7.setHeader(header13);
        org.csveed.api.Header header15 = null;
        org.csveed.common.Column column16 = column14.setHeader(header15);
        int int17 = column16.getColumnIndex();
        int int18 = column5.compareTo(column16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(column12);
        org.junit.Assert.assertNotNull(column14);
        org.junit.Assert.assertNotNull(column16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        java.lang.String str9 = column3.getColumnText();
        org.csveed.common.Column column10 = column3.nextColumn();
        java.lang.String str11 = column10.getExcelColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " index 35 (AI)" + "'", str9.equals(" index 35 (AI)"));
        org.junit.Assert.assertNotNull(column10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AJ" + "'", str11.equals("AJ"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        org.csveed.common.Column column11 = new org.csveed.common.Column();
        int int12 = column10.compareTo(column11);
        column10.setColumnName("");
        java.lang.Class<?> wildcardClass15 = column10.getClass();
        org.csveed.api.Header header16 = null;
        org.csveed.common.Column column17 = column10.setHeader(header16);
        boolean boolean18 = column9.equals((java.lang.Object) header16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        java.lang.Class<?> wildcardClass3 = column1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        column0.setColumnName("");
        java.lang.String str10 = column0.getColumnText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " index 1 (A) name \"\"" + "'", str10.equals(" index 1 (A) name \"\""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column7.setHeader(header10);
        java.lang.Class<?> wildcardClass12 = column7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column9.setHeader(header10);
        org.csveed.common.Column column12 = new org.csveed.common.Column();
        org.csveed.common.Column column13 = new org.csveed.common.Column();
        int int14 = column12.compareTo(column13);
        column12.setColumnName("");
        org.csveed.common.Column column17 = column12.nextColumn();
        org.csveed.api.Header header18 = null;
        org.csveed.common.Column column19 = column12.setHeader(header18);
        column12.setColumnName("");
        org.csveed.common.Column column22 = column12.nextLine();
        int int23 = column11.compareTo(column22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertNotNull(column19);
        org.junit.Assert.assertNotNull(column22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column4);
        column1.setColumnName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        int int8 = column0.getColumnIndex();
        int int9 = column0.getColumnIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        java.lang.String str6 = column0.getColumnName();
        org.csveed.common.Column column7 = new org.csveed.common.Column(column0);
        org.csveed.common.Column column8 = column0.nextLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(column8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column6 = new org.csveed.common.Column(10);
        int int7 = column0.compareTo(column6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column6.setHeader(header8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(column9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.String str5 = column0.toString();
        org.csveed.common.Column column6 = column0.nextLine();
        java.lang.String str7 = column0.getColumnName();
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column0.setHeader(header8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Column Name: " + "'", str5.equals("Column Name: "));
        org.junit.Assert.assertNotNull(column6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(column9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        int int6 = column5.getColumnIndex();
        java.lang.String str7 = column5.getColumnText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + " index 2 (B)" + "'", str7.equals(" index 2 (B)"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        org.csveed.common.Column column6 = column0.nextLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(column6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column9.setHeader(header10);
        java.lang.String str12 = column11.getColumnName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = column0.nextColumn();
        java.lang.String str4 = column0.getExcelColumn();
        org.csveed.common.Column column5 = new org.csveed.common.Column();
        org.csveed.common.Column column6 = new org.csveed.common.Column();
        int int7 = column5.compareTo(column6);
        column5.setColumnName("");
        org.csveed.common.Column column11 = new org.csveed.common.Column(10);
        int int12 = column5.compareTo(column11);
        column5.setColumnName(" index 35 (AI)");
        int int15 = column0.compareTo(column5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        java.lang.String str6 = column0.getColumnName();
        org.csveed.api.Header header7 = null;
        org.csveed.common.Column column8 = column0.setHeader(header7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(column8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column6 = new org.csveed.common.Column(10);
        int int7 = column0.compareTo(column6);
        column0.setColumnName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        org.csveed.common.Column column9 = new org.csveed.common.Column();
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        int int11 = column9.compareTo(column10);
        column9.setColumnName("");
        org.csveed.common.Column column15 = new org.csveed.common.Column(10);
        int int16 = column9.compareTo(column15);
        org.csveed.common.Column column17 = column15.nextLine();
        int int18 = column3.compareTo(column17);
        int int19 = column3.getColumnIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        java.lang.String str6 = column0.getColumnName();
        column0.setColumnName("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.common.Column column8 = new org.csveed.common.Column();
        org.csveed.common.Column column9 = new org.csveed.common.Column();
        int int10 = column8.compareTo(column9);
        org.csveed.common.Column column11 = new org.csveed.common.Column();
        org.csveed.common.Column column12 = new org.csveed.common.Column();
        int int13 = column11.compareTo(column12);
        int int14 = column9.compareTo(column11);
        column11.setColumnIndex((int) '#');
        org.csveed.common.Column column17 = new org.csveed.common.Column();
        org.csveed.common.Column column18 = new org.csveed.common.Column();
        int int19 = column17.compareTo(column18);
        column17.setColumnName("");
        org.csveed.common.Column column23 = new org.csveed.common.Column(10);
        int int24 = column17.compareTo(column23);
        org.csveed.common.Column column25 = column23.nextLine();
        int int26 = column11.compareTo(column25);
        org.csveed.common.Column column27 = new org.csveed.common.Column();
        org.csveed.common.Column column28 = new org.csveed.common.Column();
        int int29 = column27.compareTo(column28);
        org.csveed.common.Column column30 = new org.csveed.common.Column();
        org.csveed.common.Column column31 = new org.csveed.common.Column();
        int int32 = column30.compareTo(column31);
        int int33 = column28.compareTo(column30);
        column30.setColumnIndex((int) '#');
        org.csveed.common.Column column36 = new org.csveed.common.Column();
        org.csveed.common.Column column37 = new org.csveed.common.Column();
        int int38 = column36.compareTo(column37);
        column36.setColumnName("");
        org.csveed.common.Column column42 = new org.csveed.common.Column(10);
        int int43 = column36.compareTo(column42);
        org.csveed.common.Column column44 = column42.nextLine();
        int int45 = column30.compareTo(column44);
        org.csveed.common.Column column46 = column44.nextLine();
        int int47 = column25.compareTo(column44);
        int int48 = column0.compareTo(column44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(column25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(column44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(column46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        java.lang.Class<?> wildcardClass10 = column9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        org.csveed.common.Column column11 = new org.csveed.common.Column();
        int int12 = column10.compareTo(column11);
        column10.setColumnName("");
        org.csveed.common.Column column15 = column10.nextColumn();
        org.csveed.api.Header header16 = null;
        org.csveed.common.Column column17 = column10.setHeader(header16);
        org.csveed.api.Header header18 = null;
        org.csveed.common.Column column19 = column17.setHeader(header18);
        int int20 = column9.compareTo(column17);
        org.csveed.common.Column column21 = column9.nextColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(column15);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertNotNull(column19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(column21);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.common.Column column6 = new org.csveed.common.Column(column5);
        org.csveed.common.Column column7 = new org.csveed.common.Column();
        org.csveed.common.Column column8 = new org.csveed.common.Column();
        int int9 = column7.compareTo(column8);
        column7.setColumnName("");
        org.csveed.common.Column column12 = column7.nextColumn();
        org.csveed.api.Header header13 = null;
        org.csveed.common.Column column14 = column7.setHeader(header13);
        org.csveed.api.Header header15 = null;
        org.csveed.common.Column column16 = column14.setHeader(header15);
        org.csveed.api.Header header17 = null;
        org.csveed.common.Column column18 = column14.setHeader(header17);
        column18.setColumnName(" index 1 (A) name \"\"");
        int int21 = column6.compareTo(column18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(column12);
        org.junit.Assert.assertNotNull(column14);
        org.junit.Assert.assertNotNull(column16);
        org.junit.Assert.assertNotNull(column18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        column3.setColumnName(" index 2 (B)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        java.lang.String str8 = column7.getColumnText();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " index 1 (A) name \"\"" + "'", str8.equals(" index 1 (A) name \"\""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.Class<?> wildcardClass5 = column0.getClass();
        org.csveed.common.Column column6 = new org.csveed.common.Column(column0);
        column6.setColumnIndex(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        java.lang.String str5 = column0.toString();
        int int6 = column0.getColumnIndex();
        column0.setColumnIndex((int) (byte) 0);
        java.lang.String str9 = column0.getColumnName();
        column0.setColumnName(" index 2 (B)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Column Name: " + "'", str5.equals("Column Name: "));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column7.setHeader(header10);
        column11.setColumnName(" index 1 (A) name \"\"");
        column11.setColumnName(" index 35 (AI)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column7.setHeader(header10);
        int int12 = column11.getColumnIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        org.csveed.common.Column column9 = new org.csveed.common.Column();
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        int int11 = column9.compareTo(column10);
        column9.setColumnName("");
        org.csveed.common.Column column15 = new org.csveed.common.Column(10);
        int int16 = column9.compareTo(column15);
        org.csveed.common.Column column17 = column15.nextLine();
        int int18 = column3.compareTo(column17);
        org.csveed.common.Column column19 = column17.nextLine();
        org.csveed.api.Header header20 = null;
        org.csveed.common.Column column21 = column17.setHeader(header20);
        org.csveed.common.Column column22 = column17.nextColumn();
        org.csveed.api.Header header23 = null;
        org.csveed.common.Column column24 = column22.setHeader(header23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(column19);
        org.junit.Assert.assertNotNull(column21);
        org.junit.Assert.assertNotNull(column22);
        org.junit.Assert.assertNotNull(column24);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        column0.setColumnName("");
        org.csveed.common.Column column10 = column0.nextLine();
        java.lang.String str11 = column0.getColumnName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.csveed.common.Column column1 = new org.csveed.common.Column(1);
        column1.setColumnIndex((int) (byte) 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.csveed.common.Column column1 = new org.csveed.common.Column("Column Name: ");
        column1.setColumnIndex(0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        column0.setColumnName("");
        org.csveed.common.Column column10 = column0.nextColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column3);
        column3.setColumnIndex((int) '#');
        org.csveed.common.Column column9 = new org.csveed.common.Column();
        org.csveed.common.Column column10 = new org.csveed.common.Column();
        int int11 = column9.compareTo(column10);
        column9.setColumnName("");
        org.csveed.common.Column column15 = new org.csveed.common.Column(10);
        int int16 = column9.compareTo(column15);
        org.csveed.common.Column column17 = column15.nextLine();
        int int18 = column3.compareTo(column17);
        org.csveed.common.Column column19 = column17.nextLine();
        org.csveed.api.Header header20 = null;
        org.csveed.common.Column column21 = column17.setHeader(header20);
        org.csveed.common.Column column22 = column17.nextColumn();
        column22.setColumnName(" index 35 (AI)");
        java.lang.String str25 = column22.getColumnName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(column17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(column19);
        org.junit.Assert.assertNotNull(column21);
        org.junit.Assert.assertNotNull(column22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + " index 35 (ai)" + "'", str25.equals(" index 35 (ai)"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        column0.setColumnName("");
        org.csveed.common.Column column10 = column0.nextLine();
        org.csveed.common.Column column11 = new org.csveed.common.Column();
        org.csveed.common.Column column12 = new org.csveed.common.Column();
        int int13 = column11.compareTo(column12);
        org.csveed.common.Column column14 = new org.csveed.common.Column();
        org.csveed.common.Column column15 = new org.csveed.common.Column();
        int int16 = column14.compareTo(column15);
        int int17 = column12.compareTo(column14);
        column14.setColumnIndex((int) '#');
        java.lang.String str20 = column14.getColumnText();
        org.csveed.common.Column column21 = column14.nextColumn();
        int int22 = column0.compareTo(column14);
        org.csveed.common.Column column23 = new org.csveed.common.Column();
        org.csveed.common.Column column24 = new org.csveed.common.Column();
        int int25 = column23.compareTo(column24);
        column23.setColumnName("");
        java.lang.String str28 = column23.toString();
        org.csveed.common.Column column29 = column23.nextLine();
        java.lang.String str30 = column23.getColumnName();
        boolean boolean31 = column14.equals((java.lang.Object) str30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + " index 35 (AI)" + "'", str20.equals(" index 35 (AI)"));
        org.junit.Assert.assertNotNull(column21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Column Name: " + "'", str28.equals("Column Name: "));
        org.junit.Assert.assertNotNull(column29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.csveed.common.Column column1 = new org.csveed.common.Column(" index 2 (B)");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        column0.setColumnName("");
        org.csveed.common.Column column5 = column0.nextColumn();
        org.csveed.api.Header header6 = null;
        org.csveed.common.Column column7 = column0.setHeader(header6);
        org.csveed.api.Header header8 = null;
        org.csveed.common.Column column9 = column7.setHeader(header8);
        org.csveed.api.Header header10 = null;
        org.csveed.common.Column column11 = column7.setHeader(header10);
        column7.setColumnName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(column5);
        org.junit.Assert.assertNotNull(column7);
        org.junit.Assert.assertNotNull(column9);
        org.junit.Assert.assertNotNull(column11);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column4);
        java.lang.String str7 = column4.getExcelColumn();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.csveed.common.Column column0 = new org.csveed.common.Column();
        org.csveed.common.Column column1 = new org.csveed.common.Column();
        int int2 = column0.compareTo(column1);
        org.csveed.common.Column column3 = new org.csveed.common.Column();
        org.csveed.common.Column column4 = new org.csveed.common.Column();
        int int5 = column3.compareTo(column4);
        int int6 = column1.compareTo(column4);
        column4.setColumnName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}
