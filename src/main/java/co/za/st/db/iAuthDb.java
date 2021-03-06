package co.za.st.db;

import co.za.st.dto.Client;
import co.za.st.dto.Token;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

/**
 * Created by stevy on 2017/02/25.
 */
public interface iAuthDb {
    void insertClient(Client client);

    boolean clientExists(String clientId);

    Client getClient(String clientId, String clientSecret);

    void insertToken(Client client, Token token);

    Token getToken(String clientId);
}
