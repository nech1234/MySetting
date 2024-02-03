package com.example.mysetting

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mysetting.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)

        binding.settingProfileNextIv.setOnClickListener {
            //계정관리로 이동
        }

        binding.settingAutoRecodeOffIv.setOnClickListener {
            binding.settingAutoRecodeOffIv.visibility = View.GONE
            binding.settingAutoRecodeOnIv.visibility = View.VISIBLE
            //녹음 설정 코드
        }
        binding.settingAutoRecodeOnIv.setOnClickListener {
            binding.settingAutoRecodeOffIv.visibility = View.VISIBLE
            binding.settingAutoRecodeOnIv.visibility = View.GONE
            //녹음 설정 코드
        }
        binding.settingAlarmOffIv.setOnClickListener {
            binding.settingAlarmOffIv.visibility = View.GONE
            binding.settingAlarmOnIv.visibility = View.VISIBLE
            //알람 설정 코드
        }
        binding.settingAlarmOnIv.setOnClickListener {
            binding.settingAlarmOffIv.visibility = View.VISIBLE
            binding.settingAlarmOnIv.visibility = View.GONE
            //알람 설정 코드
        }
        binding.settingLanguageNextIv.setOnClickListener {
            //언어 설정 코드
        }
        binding.settingSubscribeNextIv.setOnClickListener {
            //구독 설정 코드
        }
        binding.settingDirectoryNextIv.setOnClickListener {
            //녹음파일 경로 설정 코드
        }

        setContentView(binding.root)
    }
}