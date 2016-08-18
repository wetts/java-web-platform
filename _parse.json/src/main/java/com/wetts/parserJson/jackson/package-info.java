/**
 * ��������jackson-2.4.1�汾
 * 
 *******************************************************************
 * jackson����Jar��˵����
 * 	jackson-core
 * 		���İ������룩���ṩ���ڡ���ģʽ��������API��
 * 	jackson-databind
 * 		���ݰ󶨰�����ѡ�����ṩ���ڡ�����󶨡��͡���ģ�͡����API��
 * 	jackson-annotations
 * 		ע�������ѡ�����ṩע�⹦�ܡ�
 * 
 ******************************************************************* 
 * Jackson�����ƣ�
 * 	����ȫ�棬�ṩ����ģʽ��json������ʽ��������󶨡�ʹ�÷��㣬����ע�����Ϊ���ǿ����ṩ�ܶ����
 * 	���ܽϸߣ�����ģʽ���Ľ���Ч�ʳ�������������Ƶ�json��
 * 
 ******************************************************************* 
 * ��ҪAPI��
 * 	���İ���JsonPaser��json����ȡ����JsonGenerator��json�������
 * 	���ݰ󶨰���ObjectMapper��������ģʽ�Ͷ����ģʽ����JsonNode�����ڵ㣩
 * 
 *******************************************************************
 * Jackson��ע�⣺
 * 	@JsonIgnoreProperties
 * 		��ע������ע�⣬������json���л�ʱ��java bean�е�һЩ���Ժ��Ե������л��ͷ����л�����Ӱ��
 * 	@JsonIgnore
 * 		��ע���������Ի��߷����ϣ�����������ϣ������ú������@JsonIgnorePropertiesһ��
 * 	@JsonFormat
 * 		��ע���������Ի��߷����ϣ�����������ϣ������Է���İ�Date����ֱ��ת��Ϊ������Ҫ��ģʽ������@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
 * 	@JsonSerialize
 * 		��ע���������Ի���getter�����ϣ����������л�ʱǶ�������Զ���Ĵ��룬�������л�һ��doubleʱ�������������λС����
 * 	@JsonDeserialize
 * 		��ע���������Ի���setter�����ϣ������ڷ����л�ʱ����Ƕ�������Զ���Ĵ��룬�����������@JsonSerialize
 * 
 */
/**
 * @author wetts
 * @created 2015/06/04
 *
 */
package com.wetts.parserjson.jackson;