package com.evan.aidlsample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by Evan on 2016-09-25.
 */

public class RemoteService  extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final AIDLadd.Stub mBinder = new AIDLadd.Stub() {

        @Override
        public int add(int a, int b) throws RemoteException {
            // TODO Auto-generated method stub
            return (a + b);
        }

    };


}
