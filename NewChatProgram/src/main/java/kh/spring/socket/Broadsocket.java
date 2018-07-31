package kh.spring.socket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
public class Broadsocket {
	private static String rtnMsg = "";
	private static final java.util.Set<Session> sessions = java.util.Collections.synchronizedSet(new java.util.HashSet<Session>());
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println("세션ID : " + session.getId());
		
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("connect");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		sessions.add(session);
	}
	
	@OnMessage
	public void onMessage(String message , Session session) {
		System.out.println("세션ID : " + session.getId() + " 내용 : " + message);
		rtnMsg = rtnMsg + message;
		sendAll(session, message);
		try {
			final Basic basic = session.getBasicRemote();
			//basic.sendText("나" + rtnMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@OnError
	public void onError(Throwable t) {
		t.printStackTrace();
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("종료 : " + session.getId()
		);
		sessions.remove(session);
	}
	
	public void sendAll(Session ss , String message) {
		try {
			System.out.println("가"+ss+"메세지 보냄"+message);
			for(Session session:Broadsocket.sessions) {
				System.out.println("나"+ss+"메세지 보냄"+message);
				if(! ss.getId().equals(session.getId())) {
					System.out.println("!!!!");
					session.getBasicRemote().sendText(ss.getId()+" : "+message);
				}else {
					System.out.println("????");
					session.getBasicRemote().sendText("내가 보낸메세지 : "+message);
					
				}
			}
			System.out.println("다"+ss+"메세지 보냄"+message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sessionName() {
		
	}
	
}
