.class public Lteam/dev/epro/apkcustom/activities/SimpleMaker;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public 〱こか〺ぃせ:Ljava/lang/String;

.field public 〺でおいここ:Landroid/widget/Button;

.field public 〻ぞまぎな〻:Landroid/widget/EditText;

.field public ぃぜぶの〸ぃ:Ljava/lang/String;

.field public ぅみぱぎぎ:Landroid/widget/CheckBox;

.field public ぇ〳〲〺すっ:Landroid/widget/EditText;

.field public ぇとしたべど:Ljava/lang/String;

.field public えがぐせほち:I

.field public ぉ〲なぱぽた:Landroid/widget/EditText;

.field public ぉざぅち〻:Landroid/widget/Spinner;

.field public ぉひのべい:Landroid/widget/CheckBox;

.field public おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

.field public くぎぶ〼のそ:Ljava/lang/String;

.field public くねねぱす〻:Ljava/lang/String;

.field public けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

.field public げがぴうあだ:Ljava/lang/String;

.field public こ〲しでおか:Ljava/lang/String;

.field public ごづごきえ:Landroid/widget/RadioGroup;

.field public ごまけがぢは:Ljava/lang/String;

.field public ざっざへづ:Landroid/widget/RadioButton;

.field public ざとぅぼこ〺:Landroid/widget/Spinner;

.field public じぜこほぱ:Landroid/widget/CheckBox;

.field public ずまげせび〳:Landroid/view/View$OnClickListener;

.field public せづっ〸ちね:Landroid/widget/CheckBox;

.field public ち〴みぎ〻び:Ljava/lang/String;

.field public ておぞぞはね:Ljava/lang/String;

.field public でどあくず:Landroid/widget/EditText;

.field public どぇぞほだ:Landroid/widget/CheckBox;

.field public ながふずは:Ljava/lang/String;

.field public なぶひせが:Landroid/widget/CheckBox;

.field public のね〱ばぁぢ:Ljava/lang/String;

.field public は〲ぱなで:Landroid/widget/Spinner;

.field public ばおぢでぎか:Ljava/lang/String;

.field public びえぁぜい:Landroid/widget/CheckBox;

.field public ぶでにく〼〳:Landroid/widget/EditText;

.field public ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぺがぅす〹ち:Ljava/lang/String;

.field public ぺづげぺが:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    new-instance v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ずまげせび〳:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static おかぷせ〱(Lteam/dev/epro/apkcustom/activities/SimpleMaker;Ljava/lang/String;Z)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object p0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 3
    invoke-static {p0, p1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    return-void
.end method

.method public static けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    const-string v0, ""

    :goto_6
    if-ge p0, p1, :cond_11

    const-string v1, "\\r\n"

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 p0, p0, 0x1

    goto :goto_6

    :cond_11
    return-object v0
.end method

.method public static ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;
    .registers 2

    .line 1
    iget-object p0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ち〴みぎ〻び:Ljava/lang/String;

    const-string v0, "\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1d

    const-string p0, "\u0019k<\u001bbkHe9IglN6>\u001eko@6l\u00197>\u001ckfNgoN4"

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1f

    :cond_1d
    const-string p0, ""

    :goto_1f
    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0094

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f090232

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉざぅち〻:Landroid/widget/Spinner;

    const p1, 0x7f090235

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    const p1, 0x7f090233

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->は〲ぱなで:Landroid/widget/Spinner;

    const p1, 0x7f0901ec

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioGroup;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごづごきえ:Landroid/widget/RadioGroup;

    new-instance v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V

    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    const p1, 0x7f09015b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->びえぁぜい:Landroid/widget/CheckBox;

    const p1, 0x7f0901f9

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->なぶひせが:Landroid/widget/CheckBox;

    const p1, 0x7f0901cd

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->どぇぞほだ:Landroid/widget/CheckBox;

    const p1, 0x7f09012a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぅみぱぎぎ:Landroid/widget/CheckBox;

    const p1, 0x7f090097

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    const p1, 0x7f090096

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺづげぺが:Landroid/widget/CheckBox;

    const p1, 0x7f0901fe

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    const p1, 0x7f090239

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    const p1, 0x7f090184

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const p1, 0x7f090185

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f0900cb

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f09013f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f090295

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const p1, 0x7f09007d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    const p1, 0x7f0900ca

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    const p1, 0x7f09007b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ:Landroid/widget/Button;

    const p1, 0x7f0901ea

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〻ぞまぎな〻:Landroid/widget/EditText;

    const p1, 0x7f09010b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉ〲なぱぽた:Landroid/widget/EditText;

    const p1, 0x7f090183

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごづごきえ:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざっざへづ:Landroid/widget/RadioButton;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    new-instance v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ:Landroid/widget/Button;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ずまげせび〳:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onPause()V
    .registers 4

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉざぅち〻:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u001c`j\u001ajfM6:Iam\u00196o\u001begK1o\u001d0i\u001efn\u001ean@1j\u001abiIg>Nfo\u001a6n\u0019kk\u001d4i\u001abf\u001c1mJefHkfN"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Laf\u001acj\u001dbk\u0019fg\u001a3o@3nM`mJj=\u001a4lI6;\u001bao\u0019jiO7=@g=Hen\u0019f:Jkm\u0019g9AgnOa>\u001d`m\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->びえぁぜい:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Nf:O4>O7=O3=Hg;J6i\u001bbgJk:\u001b0hI3jLdnHe=A4:\u001dc;@j=J3;\u001akf\u001edg\u001a1j\u001eag\u001edhO"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->なぶひせが:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u001cdmJ0k@emOa9\u001c`=Meg\u001ef9Lc>\u001canHchI4;\u001e1i\u001e19MdhO3fI0h\u001bjnNbhO7m\u001dkoNb>L"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->どぇぞほだ:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u001cc9@ahJg:K0n\u001akfOkjM19\u001c7lAfgH7g\u0019a<\u0019gg\u001a6m\u0019`jL`=H1k@0nHb9@do\u001bjgAbiI"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぅみぱぎぎ:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "If<HflA0o\u001eegAg;\u001bflI6gA1=@a9\u001a1>KciH69\u001dfg\u001ed>J6hJ`m\u001be=\u001dd:Ha9\u001bg9\u00194k@"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "NkfIb=LkjA7i\u001bdg@jo\u001bb;K3o\u001agkKjn\u00191<Iag\u001dkh\u001a0jIgoOalOd9\u001d`<\u001ed:Nf;@6lO"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Ae:@0>\u001dj=\u001aa<Mci\u0019g:NanOgiLg:MkoHdk\u001b69Ael\u001c1o\u001a3jJ`oH`n\u001bk=IbjOd=\u001e1oO"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "A3jOf;\u001bj:\u001bkoLk>Ndg\u001cfjNc>I1iMfn\u001cb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺづげぺが:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Lfl\u001dciLejA4o\u001dkhJd=\u00196lNbf\u001ba>LcmH0"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->は〲ぱなで:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@0=\u001a3jAj=JchNg:\u001c7o\u0019g:OjjKdjNgoHe"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NfoOj<L1h\u001a0mNfiAk=Odl\u00191hJflLjj\u001a0hNkk\u001cg>A`>\u001dajIkm\u001cb<M7k\u001e7;A7gNg>\u001a"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Ij;H7kOeo\u001aan\u001dd:IffAgh\u001e`<@ag\u0019ki\u001e`kI6m\u001d0j\u0019j>Ak<\u001ckg\u001bdg\u001d0oI0mMajK0kH"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〻ぞまぎな〻:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉ〲なぱぽた:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001aek\u001agn\u001eafL4>JcoL`:\u001djj\u001aek\u0019f>\u001dff\u001ak"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "O0oMal\u001e1;J0iKfk\u001cd9M09Of<\u001c6lJai\u001e49K`iI0n\u001eef\u001dc:NdfN3hO4hMbj\u001edhKkk\u001b"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onResume()V
    .registers 8

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉざぅち〻:Landroid/widget/Spinner;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001c`j\u001ajfM6:Iam\u00196o\u001begK1o\u001d0i\u001efn\u001ean@1j\u001abiIg>Nfo\u001a6n\u0019kk\u001d4i\u001abf\u001c1mJefHkfN"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001b6kN0k\u001d3mL1=\u001e0>M3f\u001ekfK49Kcm\u001bg;Ig"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "Laf\u001acj\u001dbk\u0019fg\u001a3o@3nM`mJj=\u001a4lI6;\u001bao\u0019jiO7=@g=Hen\u0019f:Jkm\u0019g9AgnOa>\u001d`m\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 5
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "IakAggLe=MegMbfN7oO6f\u0019jk\u001dki\u001bc:Lf9\u001e7kAfnHjm\u001dcjId<O6iAblOenA6:\u001aao\u0019"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごづごきえ:Landroid/widget/RadioGroup;

    invoke-virtual {v1, v0}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    iput-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざっざへづ:Landroid/widget/RadioButton;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/RadioButton;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->びえぁぜい:Landroid/widget/CheckBox;

    .line 7
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "Nf:O4>O7=O3=Hg;J6i\u001bbgJk:\u001b0hI3jLdnHe=A4:\u001dc;@j=J3;\u001akf\u001edg\u001a1j\u001eag\u001edhO"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "@e>H`l\u001a1n\u0019f>Kdj\u001b`g\u00190n\u001adhH6mH`:Ab"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->なぶひせが:Landroid/widget/CheckBox;

    .line 9
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001cdmJ0k@emOa9\u001c`=Meg\u001ef9Lc>\u001canHchI4;\u001e1i\u001e19MdhO3fI0h\u001bjnNbhO7m\u001dkoNb>L"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->どぇぞほだ:Landroid/widget/CheckBox;

    .line 11
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001cc9@ahJg:K0n\u001akfOkjM19\u001c7lAfgH7g\u0019a<\u0019gg\u001a6m\u0019`jL`=H1k@0nHb9@do\u001bjgAbiI"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぅみぱぎぎ:Landroid/widget/CheckBox;

    .line 13
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "If<HflA0o\u001eegAg;\u001bflI6gA1=@a9\u001a1>KciH69\u001dfg\u001ed>J6hJ`m\u001be=\u001dd:Ha9\u001bg9\u00194k@"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    .line 15
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "NkfIb=LkjA7i\u001bdg@jo\u001bb;K3o\u001agkKjn\u00191<Iag\u001dkh\u001a0jIgoOalOd9\u001d`<\u001ed:Nf;@6lO"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 16
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    .line 17
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "Ae:@0>\u001dj=\u001aa<Mci\u0019g:NanOgiLg:MkoHdk\u001b69Ael\u001c1o\u001a3jJ`oH`n\u001bk=IbjOd=\u001e1oO"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 19
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "A3jOf;\u001bj:\u001bkoLk>Ndg\u001cfjNc>I1iMfn\u001cb"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 20
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺづげぺが:Landroid/widget/CheckBox;

    .line 21
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "Lfl\u001dciLejA4o\u001dkhJd=\u00196lNbf\u001ba>LcmH0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->は〲ぱなで:Landroid/widget/Spinner;

    .line 23
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "@0=\u001a3jAj=JchNg:\u001c7o\u0019g:OjjKdjNgoHe"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setSelection(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 25
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "NfoOj<L1h\u001a0mNfiAk=Odl\u00191hJflLjj\u001a0hNkk\u001cg>A`>\u001dajIkm\u001cb<M7k\u001e7;A7gNg>\u001a"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    .line 26
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    .line 27
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "Ij;H7kOeo\u001aan\u001dd:IffAgh\u001e`<@ag\u0019ki\u001e`kI6m\u001d0j\u0019j>Ak<\u001ckg\u001bdg\u001d0oI0mMajK0kH"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 28
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〻ぞまぎな〻:Landroid/widget/EditText;

    .line 29
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 30
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉ〲なぱぽた:Landroid/widget/EditText;

    .line 31
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "\u001aek\u001agn\u001eafL4>JcoL`:\u001djj\u001aek\u0019f>\u001dff\u001ak"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 32
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 33
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v4, "O0oMal\u001e1;J0iKfk\u001cd9M09Of<\u001c6lJai\u001e49K`iI0n\u001eef\u001dc:NdfN3hO4hMbj\u001edhKkk\u001b"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v1, :cond_203

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    invoke-virtual {v1, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "\u0019f;I7:\u001d6nIc9I3hOjnLjk\u001dao\u001c`nK`9N1hId=A4gK1:A1i\u001dkn\u001c4l\u001c3=\u001b79Og>J1;L"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_228

    :cond_203
    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    invoke-virtual {v1, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    invoke-virtual {v1, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "A`9Jg:AenN1<Ndj\u00197:@kjOjj\u001b4fJ4g\u0019bi\u001e7fI`oH1nL1l\u001ebo\u001e0=A7h\u00190>\u001d1n\u001bf=L"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_228
    invoke-virtual {v1, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    if-ne v0, v2, :cond_233

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_23d

    :cond_233
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setEnabled(Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    :goto_23d
    return-void
.end method

.method public final 〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-static {v0, p1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
