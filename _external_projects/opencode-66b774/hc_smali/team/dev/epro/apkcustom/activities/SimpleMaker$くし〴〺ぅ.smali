.class public Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/activities/SimpleMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 1
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〻ぞまぎな〻:Landroid/widget/EditText;

    .line 2
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    move-object v2, v3

    goto :goto_28

    :cond_1c
    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 3
    iget-object v2, v2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〻ぞまぎな〻:Landroid/widget/EditText;

    .line 4
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 5
    :goto_28
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ち〴みぎ〻び:Ljava/lang/String;

    .line 6
    :try_start_2a
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 7
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉ〲なぱぽた:Landroid/widget/EditText;

    .line 8
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 9
    iput v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I
    :try_end_40
    .catch Ljava/lang/NumberFormatException; {:try_start_2a .. :try_end_40} :catch_41

    goto :goto_46

    .line 10
    :catch_41
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const/4 v2, 0x2

    .line 11
    iput v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 12
    :goto_46
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 13
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    .line 14
    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_5b

    const-string v2, "M7n\u001b4k@`oIb:Aj;\u001b7:JbiJffN0k\u0019c;\u0019g"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_67

    :cond_5b
    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 15
    iget-object v2, v2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざっざへづ:Landroid/widget/RadioButton;

    .line 16
    invoke-virtual {v2}, Landroid/widget/RadioButton;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 17
    :goto_67
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->げがぴうあだ:Ljava/lang/String;

    .line 18
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 19
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉざぅち〻:Landroid/widget/Spinner;

    .line 20
    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 21
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 22
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 23
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 24
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "\u001a4:\u0019afK6iO`k\u001d3o\u001e4k\u001ej<\u0019dm\u00190hL0f\u001bb"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_9e

    const-string v2, "\u001djk\u001eg9\u001c49K1g@bj\u001bgiO0i\u001dbkHg;@a=JbfObgO0<\u001a4=L6hJei\u001b19\u001d0j\u001ed;\u001d`;Nko@"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_de

    :cond_9e
    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 25
    iget-object v2, v2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 26
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "Hg=L0o@`l\u001a1i@4kL0nHdfA0;@6lK`>@c"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_d2

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 27
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 28
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_de

    :cond_d2
    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 29
    iget-object v2, v2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->でどあくず:Landroid/widget/EditText;

    .line 30
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 31
    :goto_de
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 32
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 33
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    const-string v2, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_104

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 35
    iget-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    const/4 v6, 0x0

    .line 36
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    goto :goto_108

    :cond_104
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 37
    iget-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 38
    :goto_108
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 39
    iput-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 40
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 41
    iget-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    .line 42
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_122

    move-object v5, v3

    goto :goto_12e

    :cond_122
    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 43
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぶでにく〼〳:Landroid/widget/EditText;

    .line 44
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 45
    :goto_12e
    iput-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 46
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 47
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_140

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 49
    iget-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 50
    iput-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 51
    :cond_140
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 52
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぉひのべい:Landroid/widget/CheckBox;

    .line 53
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    const-string v5, "\u001b0>O0>\u00196lAeh@fj@6=Lfm\u001eelMbnKe<\u001d1"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v1, :cond_26e

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 54
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 55
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1cf

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 56
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 57
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v6, "L`lOb=\u001bgmJaoKel\u001dam\u001djkI`h\u001bafJciJ7"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1b9

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "ObkIeiM6<N1i\u001a4;@7f@4hI3;Agg\u001eeiJgnHfgL49@cjIdj\u0019b:Ic:\u001ab=\u001d1j\u001a6>O1jA"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 58
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 59
    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1cd

    :cond_1b9
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 60
    iget-object v6, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇ〳〲〺すっ:Landroid/widget/EditText;

    .line 61
    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    .line 62
    :goto_1cd
    iput-object v6, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 63
    :cond_1cf
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "Ig<H3l\u001ddhKgf\u001acfJc9Ma>\u001dc>Ign\u001bj>\u001a6i\u001969\u001celN`n\u001e4j\u001b0g\u001cgfI7i\u0019emAd;\u001ab=K"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 64
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 65
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1f6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 66
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 67
    invoke-virtual {v7, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1fe

    :cond_1f6
    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 68
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 69
    invoke-virtual {v7, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    :goto_1fe
    const-string v8, "Mg:\u0019doHjgO4:\u001dblIdhKkjL0fM0oObk@a"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v7, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 70
    iput-object v6, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 71
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "Jg;\u001d7f\u0019flLbk@7gHdh\u00196jM4=M3lM`<Nk"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 72
    iget-object v8, v8, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 73
    invoke-virtual {v8, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_235

    iget-object v8, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 74
    iget-object v8, v8, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 75
    invoke-virtual {v8, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    goto :goto_23d

    :cond_235
    iget-object v8, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 76
    iget-object v8, v8, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 77
    invoke-virtual {v8, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    :goto_23d
    invoke-static {v7, v8, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 78
    iput-object v7, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 79
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 80
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 81
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_260

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 82
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 83
    invoke-virtual {v7, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    goto :goto_268

    :cond_260
    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 84
    iget-object v2, v2, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 85
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    :goto_268
    invoke-static {v6, v2, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 86
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 87
    :cond_26e
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 88
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->は〲ぱなで:Landroid/widget/Spinner;

    .line 89
    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 90
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    .line 91
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 92
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "Nj;Id<@kiMk<IcoI39Ici\u00196nL7jK6:@c"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_296

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (Android; Mobile; rv:35.0) Gecko/35.0 Firefox/35.0\r\n"

    goto/16 :goto_32b

    :cond_296
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 94
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "J4lNb:A4jA1j\u001a6m\u00197:J3=@kkH3g@akO3"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2af

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (Linux; Android 4.4.2; SAMSUNG-SM-T537A Build/KOT49H) AppleWebKit/537.36 (KHTML like Gecko) Chrome/35.0.1916.141 Safari/537.36\r\n"

    goto :goto_32b

    :cond_2af
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 96
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "Ka<\u001bdi@chMb:@7fOen\u001d1>IgjIboHc>Ma"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c8

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (Linux; Android 5.1.1; Nexus 7 Build/LMY47V) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.78 Safari/537.36 OPR/30.0.1856.93524\r\n"

    goto :goto_32b

    :cond_2c8
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 98
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "\u001c3i\u001c7h\u001d6i\u001bb>\u001ag>Kd=@1f\u001caj@3i\u001e1n\u001ec"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e1

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (X11; U; Linux x86_64; en-gb) AppleWebKit/534.35 (KHTML, like Gecko) Chrome/11.0.696.65 Safari/534.35 Puffin/2.9174AP\r\n"

    goto :goto_32b

    :cond_2e1
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 100
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "\u001c7i\u001dbn@e=KchMgm\u001cdiId<H6g\u001cegAg>\u001e3"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2fa

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (Linux; U; Android 2.0; en-us; Droid Build/ESD20) AppleWebKit/530.17 (KHTML, like Gecko) Version/4.0 Mobile Safari/530.17\r\n"

    goto :goto_32b

    :cond_2fa
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 102
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "J1fMk9Ka<\u001dkg@f9\u001bko\u001c0jIb>AdkA`>\u001aj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_313

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: Mozilla/5.0 (Linux; U; Android 2.3.3; en-us ; LS670 Build/GRI40) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1/UCBrowser/8.6.1.262/145/355\r\n"

    goto :goto_32b

    :cond_313
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 104
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ておぞぞはね:Ljava/lang/String;

    const-string v2, "\u001e7i\u0019cnL0o\u001a0=Ikg\u0019ko\u001b1:N6h\u001d0lHeoM1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_32d

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "User-Agent: [ua]\r\n"

    .line 106
    :goto_32b
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 107
    :cond_32d
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 108
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->びえぁぜい:Landroid/widget/CheckBox;

    .line 109
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_33d

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "Connection: keep-alive\r\nProxy-Connection: keep-alive\r\n"

    .line 110
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 111
    :cond_33d
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 112
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->なぶひせが:Landroid/widget/CheckBox;

    .line 113
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    const-string v2, "\r\n"

    if-eqz v1, :cond_363

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "OghO4jLd=\u001afoK1gO4n\u001b09\u001d4>\u0019jm\u0019kmN`<\u0019fm\u0019a:MkhI7l@3>N0>\u001cco\u0019b<@1gAkmI"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 114
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 115
    invoke-static {v6, v7, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 116
    iput-object v6, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 117
    :cond_363
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 118
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->どぇぞほだ:Landroid/widget/CheckBox;

    .line 119
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_387

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "Lfo\u0019aiO4>\u00196f\u001a7=Jdm\u001a`=\u001edlLj<\u001c4oO0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 120
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 121
    invoke-static {v6, v7, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 122
    iput-object v6, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 123
    :cond_387
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 124
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぅみぱぎぎ:Landroid/widget/CheckBox;

    .line 125
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_3ab

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v6, "\u001e1j\u001e1jOk>\u001a0j\u001d3nI0;@ch\u001e0>I6h@g;\u001akl@4:\u00190iL79\u001e0;\u001a1<Ifh@4hL`<L`j\u001djmN"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 126
    iget-object v7, v7, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぃぜぶの〸ぃ:Ljava/lang/String;

    .line 127
    invoke-static {v6, v7, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 128
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 129
    :cond_3ab
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 130
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->げがぴうあだ:Ljava/lang/String;

    const-string v2, "J3<\u001bahAjjHejJ7oK4i\u001b3hN7mAeg@4jK`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "I7mI6kL3jN1l\u001b09Mf<\u00190gOkgIjk\u001a`iLc"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "H6=Lf>M19\u0019jmNb9HekLb;Kg>K1nOcn\u001e4"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "[netData]\\r\n"

    const-string v9, "CONNECT [host_port] [protocol]\\r\n"

    const-string v10, "KdlJcmK39\u001ajlA0m\u001ajoJ6;OdhLdh\u001c4nA3"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "\u001eah\u0019clMaj\u001edfL6lLdnI69Jjn\u001b1o\u001a0<@7:Ic=\u001c7m\u001bb:O0kMc=AclLjg\u001de:\u001be>@4m\u0019"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, " HTTP/1.1\\r\nHost: "

    const-string v13, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "\\r\n"

    const-string v15, "\u001acfLel\u0019eiNj9IbgLdo\u0019f9NfgN4=\u001dd9\u001d4"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v16, "\u001eah\u0019clMaj\u001edfL6lLdnI69Jjn\u001b1o\u001a0<@7j\u001a4hOglKal\u001cgf\u001cki\u0019c>\u001belNk=\u001dkhI`;\u001a"

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    move-object/from16 p1, v7

    const-string v7, "H6=MfgNglAffI0i\u0019b=\u001ee;\u001e49@0fN`;@j"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v17, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v18, v2

    const-string v2, "If9\u001ccn\u001akmNk<\u001c7=H0:\u001e3oAbhI19Nf<@bmL6h\u001akgO7i\u001d3hLj;Hbj@4:\u001adjLk>\u001e3n\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x4

    const-wide/16 v23, 0x3

    const-wide/16 v25, 0x1

    if-eqz v1, :cond_70e

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 132
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 133
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v27

    const-wide/16 v29, 0x2

    cmp-long v1, v27, v29

    if-nez v1, :cond_485

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 134
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 135
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_46a

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_463

    goto/16 :goto_656

    :cond_463
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_65d

    :cond_46a
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_47e

    goto/16 :goto_656

    :cond_47e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_65d

    :cond_485
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 136
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 137
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v27

    cmp-long v1, v27, v25

    if-nez v1, :cond_587

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 138
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 139
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_506

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 140
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 141
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 142
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 143
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 144
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 145
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 146
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 147
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 148
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 149
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 150
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 151
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 152
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 153
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 154
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 155
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 156
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    add-int/lit8 v5, v5, -0x1

    .line 157
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_500

    goto :goto_56a

    :cond_500
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_572

    :cond_506
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 158
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 159
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 160
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 161
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 162
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 163
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 164
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 166
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 167
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 168
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 169
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 170
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 171
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 172
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 173
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 174
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    add-int/lit8 v5, v5, -0x1

    .line 175
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_56d

    :goto_56a
    move-object v4, v3

    goto/16 :goto_6b9

    :cond_56d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_572
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_6b9

    :cond_587
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 176
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 177
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v25

    cmp-long v1, v25, v23

    if-nez v1, :cond_5ef

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 178
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 179
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_5c6

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 180
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 181
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5bf

    goto/16 :goto_656

    :cond_5bf
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_65d

    :cond_5c6
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 182
    iget-object v6, v6, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 183
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5e8

    move-object v2, v5

    goto :goto_656

    :cond_5e8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object v2, v5

    goto :goto_65d

    :cond_5ef
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 184
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 185
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v1

    cmp-long v6, v1, v21

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    if-nez v6, :cond_6c1

    .line 186
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 187
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_62c

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v6, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 188
    iget-object v6, v6, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 189
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_626

    goto :goto_656

    :cond_626
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_65d

    :cond_62c
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static/range {v16 .. v16}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 190
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 191
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "Nf;Nki\u001a4nI`9I7o\u001cko\u0019c=J0fAfh\u001bf<\u001c6"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_658

    :goto_656
    move-object v4, v3

    goto :goto_66d

    :cond_658
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_65d
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_66d
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 192
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 193
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 194
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 195
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 196
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 197
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 198
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 199
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 200
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 201
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 202
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 203
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 204
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 205
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 206
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 207
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 208
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 209
    :goto_6b9
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_a3a

    .line 210
    :cond_6c1
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 211
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v1

    cmp-long v4, v1, v19

    if-nez v4, :cond_a40

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    move-object/from16 v5, v18

    .line 212
    iput-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->げがぴうあだ:Ljava/lang/String;

    .line 213
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 214
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_6f3

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6ec

    goto :goto_705

    :cond_6ec
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_9e8

    :cond_6f3
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_707

    :goto_705
    goto/16 :goto_9e1

    :cond_707
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_9e8

    :cond_70e
    move-object/from16 v5, v18

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 215
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 216
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v27

    const-wide/16 v29, 0x2

    cmp-long v1, v27, v29

    if-nez v1, :cond_787

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 217
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 218
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_741

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_73b

    goto :goto_753

    :cond_73b
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_75a

    :cond_741
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_755

    :goto_753
    move-object v4, v3

    goto :goto_76a

    :cond_755
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_75a
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_76a
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 219
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 220
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 221
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    .line 222
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_87f

    :cond_787
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 223
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 224
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v27

    cmp-long v1, v27, v25

    if-nez v1, :cond_7ee

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 225
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 226
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_7b6

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7b0

    goto :goto_7c8

    :cond_7b0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_7cf

    :cond_7b6
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7ca

    :goto_7c8
    move-object v4, v3

    goto :goto_7df

    :cond_7ca
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_7cf
    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_7df
    invoke-static {v2, v4, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 227
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 228
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_94a

    :cond_7ee
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 229
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 230
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v25

    cmp-long v1, v25, v23

    if-nez v1, :cond_8c5

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 231
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 232
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_82b

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 233
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 234
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_825

    goto :goto_84c

    :cond_825
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_854

    :cond_82b
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 235
    iget-object v6, v6, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 236
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_84e

    move-object v2, v5

    :goto_84c
    move-object v4, v3

    goto :goto_864

    :cond_84e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object v2, v5

    :goto_854
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_864
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 237
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 238
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 239
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    .line 240
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_87f
    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 241
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 242
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 243
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 244
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 245
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 246
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 247
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 248
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 249
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 250
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 251
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 252
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 253
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 254
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 255
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 256
    invoke-static {v2, v4, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 257
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    goto/16 :goto_a44

    .line 258
    :cond_8c5
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 259
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 260
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v1

    cmp-long v6, v1, v21

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    if-nez v6, :cond_9a0

    .line 261
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 262
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_904

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 263
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 264
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]\\r\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8fe

    goto :goto_926

    :cond_8fe
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_92d

    :cond_904
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static/range {v16 .. v16}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 265
    iget-object v5, v5, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 266
    invoke-virtual {v5, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " [protocol]\\r\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_928

    :goto_926
    move-object v4, v3

    goto :goto_93d

    :cond_928
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_92d
    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_93d
    invoke-static {v2, v4, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 267
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 268
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_94a
    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 269
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぇとしたべど:Ljava/lang/String;

    .line 270
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 271
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ながふずは:Ljava/lang/String;

    .line 272
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 273
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 274
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 275
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 276
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 277
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 278
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 279
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 280
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 281
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 282
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 283
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 284
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 285
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    add-int/lit8 v5, v5, -0x1

    .line 286
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 287
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    goto/16 :goto_a44

    .line 288
    :cond_9a0
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざとぅぼこ〺:Landroid/widget/Spinner;

    .line 289
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemId()J

    move-result-wide v1

    cmp-long v4, v1, v19

    if-nez v4, :cond_a44

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 290
    iput-object v5, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->げがぴうあだ:Ljava/lang/String;

    .line 291
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 292
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_9cf

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9c9

    goto :goto_9e1

    :cond_9c9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_9e8

    :cond_9cf
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9e3

    :goto_9e1
    move-object v4, v3

    goto :goto_9f8

    :cond_9e3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_9e8
    iget-object v5, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_9f8
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 293
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺがぅす〹ち:Ljava/lang/String;

    .line 294
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 295
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->のね〱ばぁぢ:Ljava/lang/String;

    .line 296
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 297
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くねねぱす〻:Ljava/lang/String;

    .line 298
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 299
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〱こか〺ぃせ:Ljava/lang/String;

    .line 300
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 301
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->くぎぶ〼のそ:Ljava/lang/String;

    .line 302
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 303
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->こ〲しでおか:Ljava/lang/String;

    .line 304
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 305
    iget v5, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    add-int/lit8 v5, v5, -0x1

    .line 306
    invoke-static {v4, v5}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_a3a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 307
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    .line 308
    :cond_a40
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 309
    iput-object v3, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 310
    :cond_a44
    :goto_a44
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 311
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぺづげぺが:Landroid/widget/CheckBox;

    .line 312
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_b44

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 313
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 314
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_acf

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 315
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 316
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_a86

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 317
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    .line 318
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_a80

    goto :goto_ab9

    :cond_a80
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_aa9

    :cond_a86
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 319
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    .line 320
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_aa4

    goto :goto_ab9

    :cond_aa4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_aa9
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_ab9
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 321
    iget v4, v3, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 322
    invoke-static {v3, v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 323
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    goto/16 :goto_b44

    .line 324
    :cond_acf
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 325
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->じぜこほぱ:Landroid/widget/CheckBox;

    .line 326
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_afd

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 327
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 328
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_af7

    goto :goto_b30

    :cond_af7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_b20

    :cond_afd
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 329
    iget-object v4, v4, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 330
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_b1b

    goto :goto_b30

    :cond_b1b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_b20
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-static {v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_b30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 331
    iget v4, v3, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->えがぐせほち:I

    .line 332
    invoke-static {v3, v4}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->けときぜと(Lteam/dev/epro/apkcustom/activities/SimpleMaker;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 333
    iput-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 334
    :cond_b44
    :goto_b44
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 335
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->げがぴうあだ:Ljava/lang/String;

    const-string v3, "I7oO0;JgiKk<Hc:\u001djlLdnN1f\u001bcfLc<Ia"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 336
    invoke-virtual {v1, v3, v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 338
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ばおぢでぎか:Ljava/lang/String;

    const-string v3, "\r"

    const-string v4, "\\r"

    .line 339
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "K3o\u001a7=Lfh@gmA1>Od<AbkLkjLbf@jmMk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 340
    invoke-virtual {v1, v5, v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 342
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごまけがぢは:Ljava/lang/String;

    .line 343
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001dbgLd;Jbm\u001ef:IjfM6kOgm\u001ajgMkg\u001e`<\u0019a"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 344
    invoke-virtual {v1, v3, v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 346
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ち〴みぎ〻び:Ljava/lang/String;

    const-string v3, "K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 347
    invoke-virtual {v1, v3, v2}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    const-string v2, "IbmKj9\u001ce;LaoHc=@gh@egOd;HkiIk<H7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->おかぷせ〱(Lteam/dev/epro/apkcustom/activities/SimpleMaker;Ljava/lang/String;Z)V

    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void
.end method
