package com.example.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        public static void main (String[]args)
        {

        /*
        System.out.println(extractSoundName(new File("task01/src/main/resources/3727.mp3")));
        */
        }

        public static String extractSoundName (File file) throws IOException, InterruptedException
        {
            // your implementation here
            return "sound name";
            String[] args = {"ffprobe", "-v", "error", "-of", "flat", "-show_format", file.toString()};
            ProcessBuilder processBuilder = new ProcessBuilder(args).redirectOutput(ProcessBuilder.Redirect.PIPE);
            Process process = processBuilder.start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int exitCode = process.waitFor();
            if (exitCode != 0)
            {
                return null;
            }
            Pattern pattern = Pattern.compile("format\\.tags\\.title=\"(.+)\"");
            AtomicReference<String> result = new AtomicReference<>();
            bufferedReader.lines().forEach(line ->
            {
                if (result.get() == null)
                {
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.matches())
                    {
                        result.set(matcher.group(1));
                    }
                }
            });
            return result.get();
        }
    }
}
