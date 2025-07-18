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
            "image", "https://kinxlearning.com/cdn/shop/files/exercise-10_1000x.jpg?v=1613154681"
        ),
        Map.of(
            "name", "Pull-up",
            "icon", "fa-dumbbell",
            "description", "4 sets to failure. Full range of motion, pause at the top for best contraction.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/10/pull-up-2-resized.png"
        ),
        Map.of(
            "name", "Barbell Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 8–10 reps. Control the motion, squeeze scapula at the top.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/0449/8453/3153/files/barbell_row_muscles_worked.jpg?v=1708415142"
        ),
        Map.of(
            "name", "Seated Cable Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Pull to your lower abs, avoid leaning back.",
            "completed", false,
            "image", "https://www.mybodycreator.com/content/files/2023/05/25/82_M.png"
        ),
        Map.of(
            "name", "Barbell Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep elbows tight, strict form, no swinging.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/ez-barbell-curl.jpg"
        ),
        Map.of(
            "name", "Hammer Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Focus on forearms and brachialis, slow on the way down.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-seated-hammer-curl.jpg"
        ),
        Map.of(
            "name", "T-Bar Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 8–10 reps. Chest up, pull with elbows, full range of motion.",
            "completed", false,
            "image", "https://images.squarespace-cdn.com/content/v1/5ffcea9416aee143500ea103/1638352828989-47U5HIIXG66HCZEYTG73/T-Bar%2BRows.jpeg"
        ),
        Map.of(
            "name", "Lat Pulldown",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Pull to upper chest, keep back straight.",
            "completed", false,
            "image", "https://www.wheystore.vn/upload/news_optimize/wst_1605607530_lat_pulldown_la_gi__cach_tap_lat_pulldown_de_phat_trien_co_xo_image_1605607530_1.jpg"
        ),
        Map.of(
            "name", "Straight Arm Pulldown",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Keep arms straight, isolate lats.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1633/7705/files/straight_arm_cable_pull_downs_480x480.jpg?v=1654196836"
        ),
        Map.of(
            "name", "Incline Dumbbell Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Let arms fully stretch, avoid shoulder movement.",
            "completed", false,
            "image", "https://bizweb.dktcdn.net/100/011/344/files/incline-dumbbell-curl-1.jpg?v=1680557888015"
        ),
        Map.of(
            "name", "Preacher Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Slow and strict, no bouncing at bottom.",
            "completed", false,
            "image", "https://www.kettlebellkings.com/cdn/shop/articles/Preacher_Curl_Alternatives.png?v=1731324163"
        )
    ));
    template.put("wednesday", List.of(
        Map.of(
            "name", "Squat",
            "icon", "fa-dumbbell",
            "description", "4 sets of 6–10 reps. Go at least parallel, keep your core tight and chest up.",
            "completed", false,
            "image", "https://anabolicaliens.com/cdn/shop/articles/5fbc1c1889a1d8fc84f5808b_dumbbell-goblet-squat.png?v=1641750308"
        ),
        Map.of(
            "name", "Romanian Deadlift",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Hinge at the hips and feel the  hamstring stretch.",
            "completed", false,
            "image", "https://anabolicaliens.com/cdn/shop/articles/5e595712f146e8e14db4ca6f_dumbbell-romanian-deadlift-exercise-anabolic-aliens-p-500.png?v=1644927440"
        ),
        Map.of(
            "name", "Leg Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 12–15 reps. Don’t lock your knees, full range of motion.",
            "completed", false,
            "image", "https://www.shutterstock.com/image-illustration/lever-angled-leg-press-male-260nw-2586714377.jpg"
        ),
        Map.of(
            "name", "Leg Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Squeeze hard at the top, control the tempo.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/10/lying-leg-curl-resized.png"
        ),
        Map.of(
            "name", "Standing Calf Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Pause at the top and stretch at the bottom.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/barbell-standing-leg-calf-raise.jpg"
        ),
        Map.of(
            "name", "Plank + Hanging Leg Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets. Hold plank for 45–60 sec, lift legs with control, no swinging.",
            "completed", false,
            "image", "https://www.burnthefatinnercircle.com/members/images/1789c.jpg?cb=20250701050339"
        ),
        Map.of(
            "name", "Bulgarian Split Squat",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps/leg. Stay upright, deep range, control each rep.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/bulgarian-split-squat.jpg"
        ),
        Map.of(
            "name", "Walking Lunges",
            "icon", "fa-dumbbell",
            "description", "3 sets of 20 steps. Long strides, keep knees stable.",
            "completed", false,
            "image", "data:image/jpeg;base64,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"
        ),
        Map.of(
            "name", "Leg Extension",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Lock out and squeeze quads at the top.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/05/lever-leg-extension-resized.png"
        ),
        Map.of(
            "name", "Seated Calf Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Focus on full contraction and deep stretch.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/10/Lever-Seated-Calf-Raise-plate-loaded-resized.png"
        ),
        Map.of(
            "name", "Decline Sit-up",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Go slow, engage abs, don’t use momentum.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-decline-sit-up.jpg"
        ),
        Map.of(
            "name", "Cable Crunch",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Crunch from your abs, not arms. Keep spine rounded.",
            "completed", false,
            "image", "https://www.burnthefatinnercircle.com/members/images/1680b.jpg?cb=20250701050337"
        )
    ));
    template.put("thursday", List.of(
        Map.of(
            "name", "Overhead Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–10 reps. Keep core tight, press vertically, avoid over-arching your back.",
            "completed", false,
            "image", "https://www.endomondo.com/wp-content/uploads/2024/03/Seated-Dumbbell-Shoulder-Press-1.jpg"
        ),
        Map.of(
            "name", "Dumbbell Side Lateral",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Lead with elbows, raise to shoulder height, avoid swinging.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/0754/7279/8002/files/Dumbbell_Shoulder_Workout-Dumbbell_side_lateral_raise.jpg?v=1694238238"
        ),
        Map.of(
            "name", "Rear Delt Fly",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Bend forward, raise dumbbells to side, isolate rear delts.",
            "completed", false,
            "image", "https://anabolicaliens.com/cdn/shop/articles/5f9892a2b0625c92c74ee6b8_rear-delt-fly-machine-picture.png?v=1641754148"
        ),
        Map.of(
            "name", "Dumbbell Shrugs",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15–20 reps. Lift shoulders straight up, squeeze traps at the top.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/10/dumbbell-shrug-resized.png"
        ),
        Map.of(
            "name", "Skull Crusher",
            "icon", "fa-dumbbell --force",
            "description", "3 sets of 10–12 reps. Lower slowly, keep elbows fixed and close together.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/band-skull-crusher.jpg"
        ),
        Map.of(
            "name", "Arnold Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Rotate palms from inward to outward through the press.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-standing-arnold-press.jpg"
        ),
        Map.of(
            "name", "Landmine Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Press diagonally upward with controlled movement.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/landmine-press.jpg"
        ),
        Map.of(
            "name", "Cable Lateral Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Constant tension, focus on middle delts.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/cable-leaning-lateral-raise.jpg"
        ),
        Map.of(
            "name", "Face Pull",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Pull rope to forehead, squeeze upper back and rear delts.",
            "completed", false,
            "image", "https://bizweb.dktcdn.net/100/517/390/files/face-pulls-la-gi-huong-dan-tap-face-pulls-chuan-4.webp?v=1724279726474"
        ),
        Map.of(
            "name", "Tricep Kickback",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Keep upper arms still, extend forearms fully.",
            "completed", false,
            "image", "https://kinxlearning.com/cdn/shop/files/exercise-47_1000x.jpg?v=1613157966"
        )
    ));
    template.put("friday", List.of(
        Map.of(
            "name", "Incline Bench Press",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–10 reps. Press to upper chest, keep wrists straight and chest lifted.",
            "completed", false,
            "image", "https://image.myupchar.com/9694/webp/incline-bench-press-benefits-types-technique.webp"
        ),
        Map.of(
            "name", "Chest Dips",
            "icon", "fa-dumbbell",
            "description", "3 sets to failure. Lean forward slightly, go deep, and control the movement.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/1497/9682/files/2_a0cb9dd0-9c03-421e-b1aa-4b93c2b903ff.jpg?v=1653495447"
        ),
        Map.of(
            "name", "Cable Crossover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Focus on tension, cross hands slightly at the end of the movement.",
            "completed", false,
            "image", "https://www.thethaothientruong.vn/uploads/cable-crossover-1.jpg"
        ),
        Map.of(
            "name", "EZ Bar Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Use a full range of motion. Keep elbows tight.",
            "completed", false,
            "image", "https://bizweb.dktcdn.net/100/011/344/files/barbell-curl.jpg?v=1680595604045"
        ),
        Map.of(
            "name", "Concentration Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Perform slowly, isolating each bicep with strict form.",
            "completed", false,
            "image", "https://vitruve.fit/wp-content/uploads/2025/04/concentration-curls.jpg"
        ),
        Map.of(
            "name", "Decline Dumbbell Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Lower dumbbells under control, press up without locking out fully.",
            "completed", false,
            "image", "https://www.hevyapp.com/wp-content/uploads/03011201-Dumbbell-Decline-Bench-Press_Chest.jpg"
        ),
        Map.of(
            "name", "Dumbbell Fly on Flat Bench",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Get a deep stretch and bring dumbbells together smoothly.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-fly-on-exercise-ball.jpg"
        ),
        Map.of(
            "name", "Machine Chest Press",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12–15 reps. Maintain constant tension, adjust seat height properly.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/12/machine-chest-press-resized.png"
        ),
        Map.of(
            "name", "Spider Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 12 reps. Support arms on incline bench, isolate biceps with strict form.",
            "completed", false,
            "image", "https://lh7-rt.googleusercontent.com/docsz/AD_4nXdDydNgRdm7gF6ZbFoJPoR3KVPUbjCaWwqzrU9Upx5mNR_Bp0nU-OuPb9V1HQ1gGjRk6CE5cMVZGohdkWBjTqlP2b6SLo8fwENgKwuHw-5D-9PNeRIrtLu3aGXI2nSnllpDY-4jPA?key=V4fN-ziOGc3FNoGGqseJ7rkd"
        ),
        Map.of(
            "name", "Zottman Curl",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Supinate on the way up, pronate on the way down to target forearms.",
            "completed", false,
            "image", "https://www.inspireusafoundation.org/wp-content/uploads/2023/04/zottman-curl-benefits.png"
        )
    ));
    template.put("saturday", List.of(
        Map.of(
            "name", "Pull-up or Lat Pulldown",
            "icon", "fa-dumbbell",
            "description", "4 sets of 8–12 reps. Full range of motion, squeeze lats at the top.",
            "completed", false,
            "image", "https://file.hstatic.net/1000026167/file/bai-tap-lat-pulldown_ca47c7a461264978b8d7617bf5c48d56_grande.jpg"
        ),
        Map.of(
            "name", "Dumbbell Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10–12 reps. Keep your back flat and pull with your elbows.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2017/01/bent-over-two-arm-dumbbell-row-resized.png"
        ),
        Map.of(
            "name", "Face Pull",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Pull rope to forehead, externally rotate shoulders at the top.",
            "completed", false,
            "image", "https://weighttraining.guide/wp-content/uploads/2016/10/Face-pull-resized.png"
        ),
        Map.of(
            "name", "Rear Delt Machine",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Focus on rear delts, avoid momentum and swinging.",
            "completed", false,
            "image", "https://anabolicaliens.com/cdn/shop/articles/5f9892a2b0625c92c74ee6b8_rear-delt-fly-machine-picture.png?v=1641754148"
        ),
        Map.of(
            "name", "Russian Twist + Plank",
            "icon", "fa-dumbbell",
            "description", "3 sets. 30–40 reps Russian Twist and 45–60 sec plank per set. Twist fully, stay tight in plank.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/push-up-to-side-plank.jpg"
        ),
        Map.of(
            "name", "Chest Supported Row",
            "icon", "fa-dumbbell",
            "description", "3 sets of 10 reps. Keep chest on pad, squeeze shoulder blades at the top.",
            "completed", false,
            "image", "https://cdn.shopify.com/s/files/1/0449/8453/3153/files/chest_supported_row_muscles_worked_600x600.png?v=1716192902"
        ),
        Map.of(
            "name", "Reverse Fly on Incline Bench",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Light weight, slow tempo, isolate rear delts.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/dumbbell-incline-rear-lateral-raise.jpg"
        ),
        Map.of(
            "name", "Cable Reverse Crossover",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Maintain tension, cross hands behind body to target rear delts.",
            "completed", false,
            "image", "https://www.mybodycreator.com/content/files/2023/05/25/86_M.png"
        ),
        Map.of(
            "name", "Hanging Knee Raise",
            "icon", "fa-dumbbell",
            "description", "3 sets of 15 reps. Lift knees with control, avoid swinging, focus on lower abs.",
            "completed", false,
            "image", "https://liftmanual.com/wp-content/uploads/2023/04/hanging-knees-to-elbows.jpg"
        )
    ));
    template.put("sunday", List.of(
        Map.of(
            "name", "Swimming",
            "icon", "fa-spa",
            "description", "1 hour of relaxed swimming or active recovery. Focus on breath, mobility, and circulation.",
            "completed", false,
            "image", "https://images.pexels.com/photos/1263348/pexels-photo-1263348.jpeg"
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
