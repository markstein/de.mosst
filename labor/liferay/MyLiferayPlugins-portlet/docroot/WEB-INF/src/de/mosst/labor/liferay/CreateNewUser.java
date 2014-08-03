package de.mosst.labor.liferay;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class CreateNewUser extends MVCPortlet {

	public CreateNewUser() {
		super();
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		try {
			System.out.println(UserLocalServiceUtil.getUsersCount());

			long companyId = CompanyLocalServiceUtil.getCompanies().get(0).getCompanyId();
			String screenName = "u" + System.currentTimeMillis();
			String emailAddress = screenName + "@liferay.com";
			Locale locale = Locale.GERMANY;
			long[] organizationIds = new long[0];
			long[] roleIds = new long[0];

			User usuario = PortalUtil.getUser(renderRequest);
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setScopeGroupId(usuario.getGroupId());
			User user = UserLocalServiceUtil.addUser((long) 0, companyId, false, "test", "test", false, screenName, emailAddress, (long) 0, screenName, locale, "firstName",
					"middleName", "lastName", 0, 0, false, 8, 8, 2008, "jobTitle", usuario.getGroupIds(), organizationIds, roleIds, usuario.getUserGroupIds(), false, serviceContext);
			System.out.println(UserLocalServiceUtil.getUsersCount());
			
			UserLocalServiceUtil.updateAgreedToTermsOfUse(user.getUserId(), true);
			
			UserLocalServiceUtil.updateStatus(user.getUserId(), 0);
			List<User> users = UserLocalServiceUtil.getUsers(-1, -1);
//			for (User user2 : users) {
//				System.out.println(user2.getScreenName() + " " + user2.getStatus() + " " + user2.isActive());
//			}
			
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		}

		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		super.processAction(actionRequest, actionResponse);
	}

}
