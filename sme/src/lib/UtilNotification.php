<?php
/**
 *
 */
class UtilNotification
{
    const GOOGLE_API_KEY="AAAAp6FuGcE:APA91bFnsPeki2rb7BBzSY_-M3vDkGVl5VYyax6sj-t1iJXoMyUiUDUZ2q2wOq-vnRYlzNeAks9XwG8Z5mef1tLa9KwZFUH_WXCfqNh8n8zWdr0H63CJY9gFoJCY0gIOd4oZAKiINTsk";
    const GOOGLE_GCM_URL ="https://fcm.googleapis.com/fcm/send";
    const USER_TOKEN_FCM="dqGJvZz01so:APA91bEDdSsQAGuBQXNCxZy3tAnP9af2sd85OOAF5VXYcN4d7-LMwJRBUdstrkYRToJMdanILsY4ge0h4G426anD2zXzmWMtrB9b1dW-MepXnmv48CvyEgiqzgUPm3wvLkqr0_D0isyY";


    public static function sendNotification($id, $actividad, $fecha)
    {
        $fields = array(
            'to'=> self::USER_TOKEN_FCM ,
            'priority'=> "high",
            'data' => array("id"=>$id,"actividad" =>$actividad, "fecha" => $fecha)
        );

        $headers = array(
              self::GOOGLE_GCM_URL,
              'Content-Type: application/json',
              'Authorization: key=' . self::GOOGLE_API_KEY
          );

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, self::GOOGLE_GCM_URL);
        curl_setopt($ch, CURLOPT_POST, true);
        curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
        curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($fields));

        $result = curl_exec($ch);
        curl_close($ch);

        return $result;
    }
}