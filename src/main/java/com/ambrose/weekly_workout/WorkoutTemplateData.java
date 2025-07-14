package com.ambrose.weekly_workout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class WorkoutTemplateData {
  private final Map<String, List<Map<String, Object>>> template = new HashMap<>();

  public WorkoutTemplateData() {
    template.put("monday", List.of(
        Map.of(
            "name", "Bench Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–12 reps. Focus on explosive push and full lockout.",
            "completed", false,
            "image", "https://www.shutterstock.com/shutterstock/videos/16516849/thumb/6.jpg?ip=x480"
        ),
        Map.of(
            "name", "Incline Dumbbell Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–12 reps. Control the descent, pause slightly at the bottom.",
            "completed", false,
            "image", "https://www.thethaothientruong.vn/uploads/Incline-Dumbbell-Press-la-gi-1.jpg"
        ),
        Map.of(
            "name", "Dumbbell Fly",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Wide stretch, soft lock at the top. Avoid jerking.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-fly-on-exercise-ball.jpg"
        ),
        Map.of(
            "name", "Dips or Close Grip Bench Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep elbows tight to target triceps more.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/ez-bar-close-grip-bench-press.jpg"
        ),
        Map.of(
            "name", "Tricep Rope Pushdown",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Full extension at bottom, squeeze the triceps.",
            "completed", false,
            "image", "https://www.hevyapp.com/wp-content/uploads/02001101-Cable-Pushdown-with-rope-attachment_Upper-Arms_small.jpg"
        ),
        Map.of(
            "name", "Pec Deck Machine",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Constant tension. Don’t let the handles bounce.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/MicrosoftTeams-image_5_c40117c8-4452-4801-b272-c56dcde1c0f0.jpg?v=1659021798"
        ),
        Map.of(
            "name", "Cable Chest Crossover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Cross wrists slightly at end for maximum contraction.",
            "completed", false,
            "image", "https://www.endomondo.com/wp-content/uploads/2024/01/Standing-Cable-Decline-Press.jpg"
        ),
        Map.of(
            "name", "Dumbbell Pullover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Controlled breathing, focus on chest and ribcage expansion.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/0449/8453/3153/files/Dumbbell-Pullover-Muscles-Worked_600x600.jpg?v=1718935258"
        ),
        Map.of(
            "name", "Overhead Triceps Extension",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep elbows in line. Don’t flare.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/cable-high-pulley-overhead-tricep-extension.jpg"
        ),
        Map.of(
            "name", "Skull Crusher",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Lower slowly, avoid locking out too hard at top.",
            "completed", false,
            "image", "https://pump-app.s3.eu-west-2.amazonaws.com/exercise-assets/03511101-Dumbbell-Lying-Triceps-Extension_Upper-Arms_small.jpg"
        )
    ));
    template.put("tuesday", List.of(
        Map.of(
            "name", "Deadlift",
            "icon", "fa-dumbbell",
            "description", "4 sets of 5–8 reps. Focus on form, neutral spine, and drive from legs and hips.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/field/image/deadlift.jpg"
        ),
        Map.of(
            "name", "Pull-up",
            "icon", "fa-dumbbell",
            "description", "4 sets to failure. Full range of motion, pause at the top for best contraction.",
            "completed", false,
            "image", "https://i0.wp.com/post.healthline.com/wp-content/uploads/2022/03/man-doing-pull-up-1296x728-header.jpg"
        ),
        Map.of(
            "name", "Barbell Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 8–10 reps. Control the motion, squeeze scapula at the top.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/bent-over-barbell-row.jpg"
        ),
        Map.of(
            "name", "Seated Cable Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Pull to your lower abs, avoid leaning back.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/seated-cable-row.jpg"
        ),
        Map.of(
            "name", "Barbell Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep elbows tight, strict form, no swinging.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1661/6203/articles/barbell-curl.jpg"
        ),
        Map.of(
            "name", "Hammer Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Focus on forearms and brachialis, slow on the way down.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/hammer-curl.jpg"
        ),
        Map.of(
            "name", "T-Bar Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 8–10 reps. Chest up, pull with elbows, full range of motion.",
            "completed", false,
            "image", "https://fitliferegime.com/wp-content/uploads/2022/09/T-Bar-Row-Muscles-Worked.jpg"
        ),
        Map.of(
            "name", "Lat Pulldown",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Pull to upper chest, keep back straight.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/lat-pulldown.jpg"
        ),
        Map.of(
            "name", "Straight Arm Pulldown",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Keep arms straight, isolate lats.",
            "completed", false,
            "image", "https://fitliferegime.com/wp-content/uploads/2023/01/Straight-arm-lat-pulldown.jpg"
        ),
        Map.of(
            "name", "Incline Dumbbell Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Let arms fully stretch, avoid shoulder movement.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/incline-dumbbell-curl.jpg"
        ),
        Map.of(
            "name", "Preacher Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Slow and strict, no bouncing at bottom.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/preacher-curl.jpg"
        )
    ));
    template.put("wednesday", List.of(
        Map.of(
            "name", "Squat",
            "icon", "fa-dumbbell",
            "description", "4 sets of 6–10 reps. Go at least parallel, keep your core tight and chest up.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/barbell-back-squat.jpg"
        ),
        Map.of(
            "name", "Romanian Deadlift",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Hinge at the hips and feel the  hamstring stretch.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/romanian_deadlift.jpg"
        ),
        Map.of(
            "name", "Leg Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 12–15 reps. Don’t lock your knees, full range of motion.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2021/06/BarBend-Article-Image-750-x-421-px-12.jpg"
        ),
        Map.of(
            "name", "Leg Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Squeeze hard at the top, control the tempo.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/lying-leg-curl.jpg"
        ),
        Map.of(
            "name", "Standing Calf Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Pause at the top and stretch at the bottom.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/standing-calf-raise.jpg"
        ),
        Map.of(
            "name", "Plank + Hanging Leg Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets. Hold plank for 45–60 sec, lift legs with control, no swinging.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/hanging-leg-raise.jpg"
        ),
        Map.of(
            "name", "Bulgarian Split Squat",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps/leg. Stay upright, deep range, control each rep.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/bulgarian-split-squat.jpg"
        ),
        Map.of(
            "name", "Walking Lunges",
            "icon", "fa-dumbbell",
            "description", "3 sets of 20 steps. Long strides, keep knees stable.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2022/10/Walking-Lunge-Header-BarBend.jpg"
        ),
        Map.of(
            "name", "Leg Extension",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Lock out and squeeze quads at the top.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/leg-extension.jpg"
        ),
        Map.of(
            "name", "Seated Calf Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Focus on full contraction and deep stretch.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/seated-calf-raise.jpg"
        ),
        Map.of(
            "name", "Decline Sit-up",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Go slow, engage abs, don’t use momentum.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/decline-sit-up.jpg"
        ),
        Map.of(
            "name", "Cable Crunch",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Crunch from your abs, not arms. Keep spine rounded.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/cable-crunch.jpg"
        )
    ));
    template.put("thursday", List.of(
        Map.of(
            "name", "Overhead Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–10 reps. Keep core tight, press vertically, avoid over-arching your back.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/shoulder-press.jpg"
        ),
        Map.of(
            "name", "Dumbbell Side Lateral",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Lead with elbows, raise to shoulder height, avoid swinging.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/dumbbell-lateral-raise.jpg"
        ),
        Map.of(
            "name", "Rear Delt Fly",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Bend forward, raise dumbbells to side, isolate rear delts.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/bent-over-lateral-raise.jpg"
        ),
        Map.of(
            "name", "Dumbbell Shrugs",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Lift shoulders straight up, squeeze traps at the top.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/dumbbell_shrug.jpg"
        ),
        Map.of(
            "name", "Skull Crusher",
            "icon", "fa-dumbbell --force",
            "description", "3 sets of 10–12 reps. Lower slowly, keep elbows fixed and close together.",
            "completed", false,
            "image", "https://fitliferegime.com/wp-content/uploads/2022/10/Skull-Crusher-Triceps-Exercise.webp"
        ),
        Map.of(
            "name", "Arnold Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Rotate palms from inward to outward through the press.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/arnold-press.jpg"
        ),
        Map.of(
            "name", "Landmine Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Press diagonally upward with controlled movement.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2021/05/Landmine-Press-BarBend.jpg"
        ),
        Map.of(
            "name", "Cable Lateral Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Constant tension, focus on middle delts.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/cable-lateral-raise.jpg"
        ),
        Map.of(
            "name", "Face Pull",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Pull rope to forehead, squeeze upper back and rear delts.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/face_pull.jpg"
        ),
        Map.of(
            "name", "Tricep Kickback",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Keep upper arms still, extend forearms fully.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/tricep-kickback.jpg"
        )
    ));
    template.put("friday", List.of(
        Map.of(
            "name", "Incline Bench Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–10 reps. Press to upper chest, keep wrists straight and chest lifted.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/incline-bench-press.jpg"
        ),
        Map.of(
            "name", "Chest Dips",
            "icon", "fa-dumbbell",
            "description", "3 sets to failure. Lean forward slightly, go deep, and control the movement.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2023/02/Dips-BarBend-Feature-Image.jpg"
        ),
        Map.of(
            "name", "Cable Crossover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Focus on tension, cross hands slightly at the end of the movement.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/Cable_Crossover.png"
        ),
        Map.of(
            "name", "EZ Bar Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Use a full range of motion. Keep elbows tight.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/ez-bar-curl.jpg"
        ),
        Map.of(
            "name", "Concentration Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Perform slowly, isolating each bicep with strict form.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/concentration-curl.jpg"
        ),
        Map.of(
            "name", "Decline Dumbbell Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Lower dumbbells under control, press up without locking out fully.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/decline-dumbbell-press.jpg"
        ),
        Map.of(
            "name", "Dumbbell Fly on Flat Bench",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Get a deep stretch and bring dumbbells together smoothly.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/dumbbell-fly.jpg"
        ),
        Map.of(
            "name", "Machine Chest Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Maintain constant tension, adjust seat height properly.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2022/06/Chest-Press-BarBend.jpg"
        ),
        Map.of(
            "name", "Spider Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Support arms on incline bench, isolate biceps with strict form.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/spider-curl.jpg"
        ),
        Map.of(
            "name", "Zottman Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Supinate on the way up, pronate on the way down to target forearms.",
            "completed", false,
            "image", "https://barbend.com/wp-content/uploads/2022/06/Zottman-Curl-BarBend.jpg"
        )
    ));
    template.put("saturday", List.of(
        Map.of(
            "name", "Pull-up or Lat Pulldown",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–12 reps. Full range of motion, squeeze lats at the top.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/lat-pulldown.jpg"
        ),
        Map.of(
            "name", "Dumbbell Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep your back flat and pull with your elbows.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/one-arm-dumbbell-row.jpg"
        ),
        Map.of(
            "name", "Face Pull",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Pull rope to forehead, externally rotate shoulders at the top.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/face_pull.jpg"
        ),
        Map.of(
            "name", "Rear Delt Machine",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Focus on rear delts, avoid momentum and swinging.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/rear-delt-machine.jpg"
        ),
        Map.of(
            "name", "Russian Twist + Plank",
            "icon", "fa-dumbbell",
            "description", "3 sets. 30–40 reps Russian Twist and 45–60 sec plank per set. Twist fully, stay tight in plank.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/russian-twist.jpg"
        ),
        Map.of(
            "name", "Chest Supported Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Keep chest on pad, squeeze shoulder blades at the top.",
            "completed", false,
            "image", "https://cdn.muscleandstrength.com/sites/default/files/chest-supported-row.jpg"
        ),
        Map.of(
            "name", "Reverse Fly on Incline Bench",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Light weight, slow tempo, isolate rear delts.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/incline-dumbbell-rear-delt-fly.jpg"
        ),
        Map.of(
            "name", "Cable Reverse Crossover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Maintain tension, cross hands behind body to target rear delts.",
            "completed", false,
            "image", "https://www.bodybuilding.com/images/2021/february/reverse-cable-crossover-header-960x540.jpg"
        ),
        Map.of(
            "name", "Bird-dog",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps per side. Engage core and glutes, maintain balance throughout.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/bird-dog.jpg"
        ),
        Map.of(
            "name", "Hanging Knee Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Lift knees with control, avoid swinging, focus on lower abs.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/hanging-knee-raise.jpg"
        )
    ));
    template.put("sunday", List.of(
        Map.of(
            "name", "Swimming",
            "icon", "fa-spa",
            "description", "1 hour of relaxed swimming or active recovery. Focus on breath, mobility, and circulation.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2022/11/swimming-recovery.jpg"
        )
    ));
  }

  public List<Map<String, Object>> getExercisesForDay(String day) {
    return template.getOrDefault(day, List.of());
  }

  public Set<String> getAllDays() {
    return template.keySet();
  }
}
