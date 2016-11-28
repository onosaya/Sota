//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;
import	jp.vstone.camera.*;
import	 org.opencv.core.Core;
import	 org.opencv.core.Mat;
import	org.opencv.core.Point;
import	org.opencv.core.Scalar;
import	org.opencv.imgproc.Imgproc;
import	org.opencv.imgcodecs.Imgcodecs;

public class mymain
{

	public CRobotPose pose;
	public String speechRecogResult;
	public RecogResult recogresult;
	public int faceDetectResultAge;
	public int faceDetectResultSmile;
	public String time_string;
	public String date_string;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,544,32,False,8,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,7,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,6,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,5,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*int faceDetectResultAge*/;																					//@<BlockInfo>jp.vstone.block.variable,288,32,288,32,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*int faceDetectResultSmile*/;																					//@<BlockInfo>jp.vstone.block.variable,352,32,352,32,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String time_string*/;																							//@<BlockInfo>jp.vstone.block.variable,416,32,416,32,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String date_string*/;																							//@<BlockInfo>jp.vstone.block.variable,480,32,480,32,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,16,256,544,256,False,16,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		while(0==0)																										//@<BlockInfo>jp.vstone.block.while,80,256,480,256,False,15,TRUE@</BlockInfo>
		{


																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,144,160,336,160,False,14,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 "バイバイ" ,  "名前は" ,  "こんにちは" ,  "" , 
			},false);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)"バイバイ"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"またね！だいすき",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,160,208,160,False,10,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,272,160,272,160,False,9,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"名前は"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"ソータです",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,256,208,256,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"こんにちは"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,352,208,352,False,12,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"何ですか？",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,448,208,448,False,13,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void faceTracking()																							//@<BlockInfo>jp.vstone.block.func,32,592,624,592,False,22,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.robocam.setEnableFaceSearch(true);																//@<BlockInfo>jp.vstone.block.facedetect.traking,96,592,560,592,False,21,顔追従@</BlockInfo>
		GlobalVariable.robocam.setEnableSmileDetect(true);
		GlobalVariable.robocam.setEnableAgeSexDetect(true);

		GlobalVariable.robocam.StartFaceTraking();
		try{
			GlobalVariable.detectCount=0;


																														//@<OutputChild>
			while(0==0)																									//@<BlockInfo>jp.vstone.block.while,160,592,496,592,False,20,TRUE@</BlockInfo>
			{


																														//@<OutputChild>
				GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();									//@<BlockInfo>jp.vstone.block.facedetect.isdetect,224,544,432,544,False,19,コメント@</BlockInfo>

				if(GlobalVariable.faceresult.isDetect()) GlobalVariable.detectCount++;
				else GlobalVariable.detectCount=0;

				if(GlobalVariable.detectCount>(int)1)
				{
																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,544,288,544,False,18,@</BlockInfo>
																														//@<EndOfBlock/>
					main();																								//@<BlockInfo>jp.vstone.block.callfunc.base,352,544,352,544,False,17,@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>

				}else
				{
																														//@<OutputChild>
																														//@</OutputChild>

				}
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
																														//@</OutputChild>


		}finally{
			GlobalVariable.robocam.StopFaceTraking();
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void faceTracking1()																							//@<BlockInfo>jp.vstone.block.func,32,768,800,752,False,40,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.robocam.setEnableFaceSearch(true);																//@<BlockInfo>jp.vstone.block.facedetect.traking,96,768,720,752,False,39,顔追従@</BlockInfo>
		GlobalVariable.robocam.setEnableSmileDetect(true);
		GlobalVariable.robocam.setEnableAgeSexDetect(true);

		GlobalVariable.robocam.StartFaceTraking();
		try{
			GlobalVariable.detectCount=0;


																														//@<OutputChild>
			while(0==0)																									//@<BlockInfo>jp.vstone.block.while,0,848,1104,832,False,38,TRUE@</BlockInfo>
			{


																														//@<OutputChild>
				GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();									//@<BlockInfo>jp.vstone.block.facedetect.isdetect,48,912,1008,912,False,37,コメント@</BlockInfo>

				if(GlobalVariable.faceresult.isDetect()) GlobalVariable.detectCount++;
				else GlobalVariable.detectCount=0;

				if(GlobalVariable.detectCount>(int)1)
				{
																														//@<OutputChild>
					GlobalVariable.robocam.setEnableFaceSearch(false);													//@<BlockInfo>jp.vstone.block.facedetect.traking,112,912,944,912,False,36,顔追従@</BlockInfo>
					GlobalVariable.robocam.setEnableSmileDetect(true);
					GlobalVariable.robocam.setEnableAgeSexDetect(true);

					GlobalVariable.robocam.StartFaceTraking();
					try{
						GlobalVariable.detectCount=0;


																														//@<OutputChild>
						GlobalVariable.sotawish.Say((String)"こんにちは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,912,176,912,False,35,@</BlockInfo>
																														//@<EndOfBlock/>
						{																								//@<BlockInfo>jp.vstone.block.facedetect.gender2,240,816,368,816,False,34,@</BlockInfo>
							boolean isMale=false,isFemale=false;
							GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();
							if(GlobalVariable.faceresult.isMale()!=null) isMale = GlobalVariable.faceresult.isMale();
							if(GlobalVariable.faceresult.isFemale()!=null) isFemale = GlobalVariable.faceresult.isFemale();

							if( isMale )
							{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"あなたは男性ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,816,304,816,False,23,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

							}else if( isFemale )
							{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"あなたは女性ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,912,304,912,False,24,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

							}else
							{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"わかりません",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,1008,304,1008,False,25,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

							}
						}
																														//@<EndOfBlock/>
						GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();							//@<BlockInfo>jp.vstone.block.facedetect.age2,432,816,560,816,False,33,@</BlockInfo>
						faceDetectResultAge = GlobalVariable.faceresult.getAge();

						if(GlobalVariable.faceresult.getAge()<=(int)20)
						{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"20歳以下ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,816,496,816,False,26,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

						}else if(GlobalVariable.faceresult.getAge()<=(int)30)
						{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"21歳から30歳ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,912,496,912,False,27,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

						}else
						{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"31歳以上ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,496,1008,496,1008,False,28,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

						}
																														//@<EndOfBlock/>
						GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();							//@<BlockInfo>jp.vstone.block.facedetect.smile2,624,864,752,864,False,32,@</BlockInfo>
						faceDetectResultSmile = GlobalVariable.faceresult.getSmile();

						if(GlobalVariable.faceresult.getSmile()>=(int)45)
						{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"いい笑顔ですね",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,688,864,688,864,False,29,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

						}else
						{
																														//@<OutputChild>
							GlobalVariable.sotawish.Say((String)"もっと笑って",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,688,960,688,960,False,30,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

						}
																														//@<EndOfBlock/>
						main();																							//@<BlockInfo>jp.vstone.block.callfunc.base,816,912,816,912,False,31,@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>


					}finally{
						GlobalVariable.robocam.StopFaceTraking();
					}
																														//@<EndOfBlock/>
																														//@</OutputChild>

				}else
				{
																														//@<OutputChild>
																														//@</OutputChild>

				}
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
																														//@</OutputChild>


		}finally{
			GlobalVariable.robocam.StopFaceTraking();
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,688,96,848,96,False,42,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"こんにちは",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);			//@<BlockInfo>jp.vstone.block.talk.say,752,96,752,96,False,41,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method3()																								//@<BlockInfo>jp.vstone.block.func,560,1264,752,1264,False,45,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		time_string = CRobotUtil.getTimeString();																		//@<BlockInfo>jp.vstone.block.time.gettime,624,1264,624,1264,False,44,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.time.getdate,688,1264,688,1264,False,43,ロボット内のカレンダーより現在年月日を文字列で取得し、変数String date_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	int var=0;																											//@<BlockInfo>jp.vstone.block.variable,368,1328,368,1328,False,46,break@</BlockInfo>
																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	public void method1()																								//@<BlockInfo>jp.vstone.block.func,128,1200,400,1200,False,49,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		{																												//@<BlockInfo>jp.vstone.block.facedetect.stillpicture,192,1200,192,1200,False,48,still@</BlockInfo>
			String filepath = "/var/sota/photo/";
			filepath += (String)"picture";
			boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
			if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();
			GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
			GlobalVariable.robocam.StillPicture(filepath);

			CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
			if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();
		}																												//@<EndOfBlock/>
		time_string = CRobotUtil.getTimeString();																		//@<BlockInfo>jp.vstone.block.time.gettime,256,1200,256,1200,False,47,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	{																													//@<BlockInfo>jp.vstone.block.setpose,64,1120,64,1120,False,50,@</BlockInfo>
		GlobalVariable.motion.play((CRobotPose)pose,(int)1000);
		if((boolean)true) CRobotUtil.wait((int)1000);
	}
																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	public void method2()																								//@<BlockInfo>jp.vstone.block.func,64,1312,192,1312,False,52,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		date_string = CRobotUtil.getDateString();																		//@<BlockInfo>jp.vstone.block.freeproc,128,1312,128,1312,False,51,@</BlockInfo>
				time_string = CRobotUtil.getTimeString();

				String date = date_string;
				String time = time_string;

				String date1 = date_string;
				String time1 = time_string;

				String[] regex = {"年","月","時　","分　","日","秒","曜","月","火","水","木","金","土"};

				for(int i = 0; i < 13; i++){
					if(i <= 1){
						date = date.replaceAll(regex[i], "/");
					}
					else if(i <= 3){
						time = time.replaceAll(regex[i], ":");
					}
					else{
						date = date.replaceAll(regex[i], "");
						time = time.replaceAll(regex[i], "");
					}

				}
				System.out.println(date);
				System.out.println(time);

				for(int j = 0; j < 13; j++){
					if(j <= 1){
						date1 = date1.replaceAll(regex[j], "_");
					}
					else if(j <= 3){
						time1 = time1.replaceAll(regex[j], "_");
					}
					else{
						date1 = date1.replaceAll(regex[j], "");
						time1 = time1.replaceAll(regex[j], "");
					}
				}
				System.out.println(date1);
				System.out.println(time1);

				String dt = date+" "+time;

				String dt2 = date1+"_"+time1;



				String filepath = "/var/sota/photo/";
				filepath += dt2;



				boolean isTrakcing=GlobalVariable.robocam.isAliveFaceDetectTask();
				if(isTrakcing) GlobalVariable.robocam.StopFaceTraking();

				GlobalVariable.sotawish.Say((String)"写真撮るよ",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);
				GlobalVariable.sotawish.Say((String)"３、２、１",MotionAsSotaWish.MOTION_TYPE_TALK,(int)3,(int)13,(int)11);


				GlobalVariable.robocam.initStill(new CameraCapture(CameraCapture.CAP_IMAGE_SIZE_5Mpixel, CameraCapture.CAP_FORMAT_MJPG));
				GlobalVariable.robocam.StillPicture(filepath);

				CRobotUtil.Log("stillpicture","save picthre file to \"" + filepath +"\"");
				if(isTrakcing) GlobalVariable.robocam.StartFaceTraking();

				String path_in = "/var/sota/photo/"+dt2+".jpg";
				String path_out = "/var/sota/photo/after_"+dt2+".jpg";

				Mat mat_src = new Mat();

				mat_src = Imgcodecs.imread(path_in);
				Imgproc.putText(mat_src, dt, new Point(1650, 1900), Core.FONT_HERSHEY_SIMPLEX, 2.4f, new Scalar(15, 143, 239), 4);

				Imgcodecs.imwrite(path_out, mat_src);
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>
	

}
