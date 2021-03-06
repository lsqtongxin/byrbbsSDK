package cn.byr.bbs.sdk.api;

import cn.byr.bbs.sdk.auth.Oauth2AccessToken;
import cn.byr.bbs.sdk.net.RequestListener;
import cn.byr.bbs.sdk.utils.URLHelper;

/**
 * BoardApi: get board information
 *
 * @author ALSO
 */
public class BoardApi extends BaseApi {

    private String BD_URL = URLHelper.BOARD;

    public BoardApi(Oauth2AccessToken accessToken) {
        super(accessToken);
    }

    /**
     * get board information
     *
     * @param name     valid board name
     * @param listener
     */
    public void getBoardInfo(String name, RequestListener listener) {
        if (name == null || listener == null) {
            return;
        }

        String url = BD_URL + '/' + name;

        asyncRequest(url, HTTP_GET, null, listener);
    }

}
