/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20 Jun, 2016 7:36:24 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.acceleratorservices.model.email;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailAttachmentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.List;

/**
 * Generated model class for type EmailMessage first defined at extension acceleratorservices.
 * <p>
 * Extending EmailMessage type with additional attributes.
 */
@SuppressWarnings("all")
public class EmailMessageModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "EmailMessage";
	
	/**<i>Generated relation code constant for relation <code>BusinessProcess2EmailMessageRel</code> defining source attribute <code>process</code> in extension <code>acceleratorservices</code>.</i>*/
	public final static String _BUSINESSPROCESS2EMAILMESSAGEREL = "BusinessProcess2EmailMessageRel";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.sent</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SENT = "sent";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.replyToAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String REPLYTOADDRESS = "replyToAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.subject</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SUBJECT = "subject";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.body</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String BODY = "body";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.bodyMedia</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String BODYMEDIA = "bodyMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.sentDate</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SENTDATE = "sentDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.sentMessageID</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String SENTMESSAGEID = "sentMessageID";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.toAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String TOADDRESSES = "toAddresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.ccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String CCADDRESSES = "ccAddresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.bccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String BCCADDRESSES = "bccAddresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.fromAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String FROMADDRESS = "fromAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.attachments</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String ATTACHMENTS = "attachments";
	
	/** <i>Generated constant</i> - Attribute key of <code>EmailMessage.process</code> attribute defined at extension <code>acceleratorservices</code>. */
	public static final String PROCESS = "process";
	
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sent</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Boolean _sent;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.replyToAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _replyToAddress;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.subject</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _subject;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.body</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _body;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.bodyMedia</code> attribute defined at extension <code>acceleratorservices</code>. */
	private MediaModel _bodyMedia;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sentDate</code> attribute defined at extension <code>acceleratorservices</code>. */
	private Date _sentDate;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.sentMessageID</code> attribute defined at extension <code>acceleratorservices</code>. */
	private String _sentMessageID;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.toAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailAddressModel> _toAddresses;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.ccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailAddressModel> _ccAddresses;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.bccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailAddressModel> _bccAddresses;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.fromAddress</code> attribute defined at extension <code>acceleratorservices</code>. */
	private EmailAddressModel _fromAddress;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.attachments</code> attribute defined at extension <code>acceleratorservices</code>. */
	private List<EmailAttachmentModel> _attachments;
	
	/** <i>Generated variable</i> - Variable of <code>EmailMessage.process</code> attribute defined at extension <code>acceleratorservices</code>. */
	private BusinessProcessModel _process;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public EmailMessageModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public EmailMessageModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _replyToAddress initial attribute declared by type <code>EmailMessage</code> at extension <code>acceleratorservices</code>
	 * @param _subject initial attribute declared by type <code>EmailMessage</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public EmailMessageModel(final String _replyToAddress, final String _subject)
	{
		super();
		setReplyToAddress(_replyToAddress);
		setSubject(_subject);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _replyToAddress initial attribute declared by type <code>EmailMessage</code> at extension <code>acceleratorservices</code>
	 * @param _subject initial attribute declared by type <code>EmailMessage</code> at extension <code>acceleratorservices</code>
	 */
	@Deprecated
	public EmailMessageModel(final ItemModel _owner, final String _replyToAddress, final String _subject)
	{
		super();
		setOwner(_owner);
		setReplyToAddress(_replyToAddress);
		setSubject(_subject);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.attachments</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attachments
	 */
	@Accessor(qualifier = "attachments", type = Accessor.Type.GETTER)
	public List<EmailAttachmentModel> getAttachments()
	{
		if (this._attachments!=null)
		{
			return _attachments;
		}
		return _attachments = getPersistenceContext().getValue(ATTACHMENTS, _attachments);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the bccAddresses
	 */
	@Accessor(qualifier = "bccAddresses", type = Accessor.Type.GETTER)
	public List<EmailAddressModel> getBccAddresses()
	{
		if (this._bccAddresses!=null)
		{
			return _bccAddresses;
		}
		return _bccAddresses = getPersistenceContext().getValue(BCCADDRESSES, _bccAddresses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.body</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the body - Body of the email message.
	 */
	@Accessor(qualifier = "body", type = Accessor.Type.GETTER)
	public String getBody()
	{
		if (this._body!=null)
		{
			return _body;
		}
		return _body = getPersistenceContext().getValue(BODY, _body);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.bodyMedia</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	@Accessor(qualifier = "bodyMedia", type = Accessor.Type.GETTER)
	public MediaModel getBodyMedia()
	{
		if (this._bodyMedia!=null)
		{
			return _bodyMedia;
		}
		return _bodyMedia = getPersistenceContext().getValue(BODYMEDIA, _bodyMedia);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.ccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the ccAddresses
	 */
	@Accessor(qualifier = "ccAddresses", type = Accessor.Type.GETTER)
	public List<EmailAddressModel> getCcAddresses()
	{
		if (this._ccAddresses!=null)
		{
			return _ccAddresses;
		}
		return _ccAddresses = getPersistenceContext().getValue(CCADDRESSES, _ccAddresses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.fromAddress</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the fromAddress
	 */
	@Accessor(qualifier = "fromAddress", type = Accessor.Type.GETTER)
	public EmailAddressModel getFromAddress()
	{
		if (this._fromAddress!=null)
		{
			return _fromAddress;
		}
		return _fromAddress = getPersistenceContext().getValue(FROMADDRESS, _fromAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.process</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the process
	 */
	@Accessor(qualifier = "process", type = Accessor.Type.GETTER)
	public BusinessProcessModel getProcess()
	{
		if (this._process!=null)
		{
			return _process;
		}
		return _process = getPersistenceContext().getValue(PROCESS, _process);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.replyToAddress</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	@Accessor(qualifier = "replyToAddress", type = Accessor.Type.GETTER)
	public String getReplyToAddress()
	{
		if (this._replyToAddress!=null)
		{
			return _replyToAddress;
		}
		return _replyToAddress = getPersistenceContext().getValue(REPLYTOADDRESS, _replyToAddress);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentDate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the sentDate - Date of sending the email message.
	 */
	@Accessor(qualifier = "sentDate", type = Accessor.Type.GETTER)
	public Date getSentDate()
	{
		if (this._sentDate!=null)
		{
			return _sentDate;
		}
		return _sentDate = getPersistenceContext().getValue(SENTDATE, _sentDate);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sentMessageID</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the sentMessageID - Identifier of the email message.
	 */
	@Accessor(qualifier = "sentMessageID", type = Accessor.Type.GETTER)
	public String getSentMessageID()
	{
		if (this._sentMessageID!=null)
		{
			return _sentMessageID;
		}
		return _sentMessageID = getPersistenceContext().getValue(SENTMESSAGEID, _sentMessageID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.subject</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the subject - Subject of the email message.
	 */
	@Accessor(qualifier = "subject", type = Accessor.Type.GETTER)
	public String getSubject()
	{
		if (this._subject!=null)
		{
			return _subject;
		}
		return _subject = getPersistenceContext().getValue(SUBJECT, _subject);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.toAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the toAddresses
	 */
	@Accessor(qualifier = "toAddresses", type = Accessor.Type.GETTER)
	public List<EmailAddressModel> getToAddresses()
	{
		if (this._toAddresses!=null)
		{
			return _toAddresses;
		}
		return _toAddresses = getPersistenceContext().getValue(TOADDRESSES, _toAddresses);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailMessage.sent</code> attribute defined at extension <code>acceleratorservices</code>. 
	 * @return the sent - Is set when the email message has been already sent.
	 */
	@Accessor(qualifier = "sent", type = Accessor.Type.GETTER)
	public boolean isSent()
	{
		return toPrimitive( _sent = getPersistenceContext().getValue(SENT, _sent));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.attachments</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the attachments
	 */
	@Accessor(qualifier = "attachments", type = Accessor.Type.SETTER)
	public void setAttachments(final List<EmailAttachmentModel> value)
	{
		_attachments = getPersistenceContext().setValue(ATTACHMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.bccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the bccAddresses
	 */
	@Accessor(qualifier = "bccAddresses", type = Accessor.Type.SETTER)
	public void setBccAddresses(final List<EmailAddressModel> value)
	{
		_bccAddresses = getPersistenceContext().setValue(BCCADDRESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.body</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the body - Body of the email message.
	 */
	@Accessor(qualifier = "body", type = Accessor.Type.SETTER)
	public void setBody(final String value)
	{
		_body = getPersistenceContext().setValue(BODY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.bodyMedia</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the bodyMedia - Body of the email message which is too big to put in 'body' attribute
	 */
	@Accessor(qualifier = "bodyMedia", type = Accessor.Type.SETTER)
	public void setBodyMedia(final MediaModel value)
	{
		_bodyMedia = getPersistenceContext().setValue(BODYMEDIA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.ccAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the ccAddresses
	 */
	@Accessor(qualifier = "ccAddresses", type = Accessor.Type.SETTER)
	public void setCcAddresses(final List<EmailAddressModel> value)
	{
		_ccAddresses = getPersistenceContext().setValue(CCADDRESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.fromAddress</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the fromAddress
	 */
	@Accessor(qualifier = "fromAddress", type = Accessor.Type.SETTER)
	public void setFromAddress(final EmailAddressModel value)
	{
		_fromAddress = getPersistenceContext().setValue(FROMADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.process</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the process
	 */
	@Accessor(qualifier = "process", type = Accessor.Type.SETTER)
	public void setProcess(final BusinessProcessModel value)
	{
		_process = getPersistenceContext().setValue(PROCESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>EmailMessage.replyToAddress</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the replyToAddress - It's a string value with email address that message has to be replied to.
	 */
	@Accessor(qualifier = "replyToAddress", type = Accessor.Type.SETTER)
	public void setReplyToAddress(final String value)
	{
		_replyToAddress = getPersistenceContext().setValue(REPLYTOADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.sent</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the sent - Is set when the email message has been already sent.
	 */
	@Accessor(qualifier = "sent", type = Accessor.Type.SETTER)
	public void setSent(final boolean value)
	{
		_sent = getPersistenceContext().setValue(SENT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.sentDate</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the sentDate - Date of sending the email message.
	 */
	@Accessor(qualifier = "sentDate", type = Accessor.Type.SETTER)
	public void setSentDate(final Date value)
	{
		_sentDate = getPersistenceContext().setValue(SENTDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.sentMessageID</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the sentMessageID - Identifier of the email message.
	 */
	@Accessor(qualifier = "sentMessageID", type = Accessor.Type.SETTER)
	public void setSentMessageID(final String value)
	{
		_sentMessageID = getPersistenceContext().setValue(SENTMESSAGEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>EmailMessage.subject</code> attribute defined at extension <code>acceleratorservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the subject - Subject of the email message.
	 */
	@Accessor(qualifier = "subject", type = Accessor.Type.SETTER)
	public void setSubject(final String value)
	{
		_subject = getPersistenceContext().setValue(SUBJECT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>EmailMessage.toAddresses</code> attribute defined at extension <code>acceleratorservices</code>. 
	 *  
	 * @param value the toAddresses
	 */
	@Accessor(qualifier = "toAddresses", type = Accessor.Type.SETTER)
	public void setToAddresses(final List<EmailAddressModel> value)
	{
		_toAddresses = getPersistenceContext().setValue(TOADDRESSES, value);
	}
	
}
