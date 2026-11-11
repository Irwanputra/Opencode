.class public Landroidx/fragment/app/Fragment;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lづざかべべ/のぷのちつ/ぁごぐすすぃ;
.implements Lづざかべべ/のぷのちつ/ごづごきえ;
.implements Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/Fragment$げつ〴ぬぐ;,
        Landroidx/fragment/app/Fragment$くし〴〺ぅ;,
        Landroidx/fragment/app/Fragment$〺つふすそ;,
        Landroidx/fragment/app/Fragment$SavedState;
    }
.end annotation


# static fields
.field public static final こ〲しでおか:Ljava/lang/Object;


# instance fields
.field public 〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

.field public 〺つふすそ:I

.field public 〺でおいここ:Z

.field public 〻ぞまぎな〻:I

.field public ぁごぐすすぃ:Landroid/os/Bundle;

.field public ぃぜぶの〸ぃ:Z

.field public いいにぽつ:I

.field public ぅみぱぎぎ:Z

.field public ぇ〳〲〺すっ:Z

.field public ぇとしたべど:Z

.field public ぇぬぎばつ:Z

.field public えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

.field public ぉ〲なぱぽた:Ljava/lang/String;

.field public ぉざぅち〻:Z

.field public ぉひのべい:Landroid/view/View;

.field public おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

.field public おぐぴう〸ず:Z

.field public くし〴〺ぅ:Landroid/os/Bundle;

.field public けときぜと:Z

.field public げがぴうあだ:F

.field public ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

.field public ごまけがぢは:Lづざかべべ/ぉざぅち〻/〺つふすそ;

.field public ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:Z

.field public せづっ〸ちね:Landroid/view/View;

.field public ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

.field public づざかべべ:Ljava/lang/Boolean;

.field public ておぞぞはね:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

.field public てぜきぽく:Z

.field public でどあくず:Landroidx/fragment/app/Fragment;

.field public どぇぞほだ:Z

.field public ながふずは:Landroid/view/LayoutInflater;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public なぶひせが:Z

.field public のぷのちつ:Z

.field public は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public ばおぢでぎか:Lづざかべべ/のぷのちつ/てぜきぽく;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3066\u305c\u304d\u307d\u304f<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;"
        }
    .end annotation
.end field

.field public びえぁぜい:Z

.field public びぐびあび:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public ぶでにく〼〳:I

.field public ぷぞてのほき:Z

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:Ljava/lang/String;

.field public ぺづげぺが:Landroid/view/ViewGroup;

.field public ぺふねづ〺:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/Fragment;->こ〲しでおか:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/Fragment;->〺つふすそ:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ぺぁあねじ:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ぺふねづ〺:Ljava/lang/Boolean;

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-direct {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぅみぱぎぎ:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->けときぜと:Z

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ておぞぞはね:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    new-instance v0, Lづざかべべ/のぷのちつ/てぜきぽく;

    invoke-direct {v0}, Lづざかべべ/のぷのちつ/てぜきぽく;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ばおぢでぎか:Lづざかべべ/のぷのちつ/てぜきぽく;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->びえぁぜい()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 2

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .registers 2

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .registers 5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->くねねぱす〻()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->なぎぱいぢぎ(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/Fragment;->ぶでにく〼〳:I

    if-eqz v1, :cond_2b

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/Fragment;->ぶでにく〼〳:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2b
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->ぉ〲なぱぽた:Ljava/lang/String;

    if-eqz v1, :cond_39

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->ぉ〲なぱぽた:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_39
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〱かけばぜぐ(Landroid/os/Bundle;)V
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_17

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_c

    .line 1
    :cond_8
    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->くし〴〺ぅ()Z

    move-result v0

    :goto_c
    if-nez v0, :cond_f

    goto :goto_17

    .line 2
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    :goto_17
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->ぁごぐすすぃ:Landroid/os/Bundle;

    return-void
.end method

.method public final 〱こか〺ぃせ()Landroid/content/Context;
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->いいにぽつ()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a context."

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public 〳ぜぞぜべっ()Landroid/animation/Animator;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->〺つふすそ:Landroid/animation/Animator;

    return-object v0
.end method

.method public 〴ねぷぐくぼ(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    return-void
.end method

.method public final 〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_b

    new-instance v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    return-object v0
.end method

.method public 〺でおいここ()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public 〻ぞまぎな〻()I
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->くし〴〺ぅ:I

    return v0
.end method

.method public ぁごぐすすぃ()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    return-object v0
.end method

.method public ぃぜぶの〸ぃ(Landroid/view/MenuItem;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public いいにぽつ()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_8

    .line 1
    :cond_6
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/content/Context;

    :goto_8
    return-object v0
.end method

.method public final ぅみぱぎぎ()Z
    .registers 2

    iget v0, p0, Landroidx/fragment/app/Fragment;->ざとぅぼこ〺:I

    if-lez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public ぇいうげ〱〹(Landroidx/fragment/app/Fragment$くし〴〺ぅ;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->いいにぽつ:Landroidx/fragment/app/Fragment$くし〴〺ぅ;

    if-ne p1, v0, :cond_a

    return-void

    :cond_a
    if-eqz p1, :cond_26

    if-nez v0, :cond_f

    goto :goto_26

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_26
    :goto_26
    if-eqz p1, :cond_30

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;

    .line 1
    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->くし〴〺ぅ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->くし〴〺ぅ:I

    :cond_30
    return-void
.end method

.method public ぇとしたべど()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public ぇぬぎばつ()I
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->づざかべべ:I

    return v0
.end method

.method public えがぐせほち(Landroid/os/Bundle;)V
    .registers 2

    return-void
.end method

.method public final ぉ〲なぱぽた(I)Ljava/lang/String;
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->ごづごきえ()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ぉざぅち〻()I
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->なぎぱいぢぎ:I

    return v0
.end method

.method public ぉねぞはがぞ(Landroid/content/Intent;I)V
    .registers 5
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v0, :cond_9

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, p2, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->おぐぴう〸ず(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v0, " not attached to Activity"

    invoke-static {p2, p0, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぉひのべい(Landroid/content/Context;)V
    .registers 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-nez v0, :cond_9

    const/4 v0, 0x0

    goto :goto_b

    .line 1
    :cond_9
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:Landroid/app/Activity;

    :goto_b
    if-eqz v0, :cond_12

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 3
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    :cond_12
    return-void
.end method

.method public おかぷせ〱()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public おぐぴう〸ず()I
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->びぐびあび:I

    return v0
.end method

.method public かづげぃぁ〺(Landroid/os/Bundle;)V
    .registers 3

    if-eqz p1, :cond_14

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_14

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->にぢ〱ぁな(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻()V

    :cond_14
    return-void
.end method

.method public きぬどぼみ〸(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぅみぱぎぎ:Z

    if-eq v0, p1, :cond_19

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->ぅみぱぎぎ:Z

    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->どぇぞほだ:Z

    if-eqz p1, :cond_19

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->なぶひせが()Z

    move-result p1

    if-eqz p1, :cond_19

    .line 1
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-nez p1, :cond_19

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->ぇぬぎばつ()V

    :cond_19
    return-void
.end method

.method public ぎきぁ〱ぢ(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->どぇぞほだ:Z

    if-eq v0, p1, :cond_15

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->どぇぞほだ:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->なぶひせが()Z

    move-result p1

    if-eqz p1, :cond_15

    .line 1
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-nez p1, :cond_15

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->ぇぬぎばつ()V

    :cond_15
    return-void
.end method

.method public final くぎぶ〼のそ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_5

    return-object v0

    .line 2
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not associated with a fragment manager."

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-object v0
.end method

.method public final くねねぱす〻()Landroidx/fragment/app/FragmentActivity;
    .registers 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to an activity."

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public けときぜと(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    const/4 p1, 0x0

    return-object p1
.end method

.method public げがぴうあだ(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .registers 3

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ()Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->な〱ちぉじ(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public こ〲しでおか(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .registers 6

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->きぬどぼみ〸()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぉざぅち〻:Z

    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    invoke-direct {v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->けときぜと(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz p1, :cond_2c

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    .line 1
    iget-object p2, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    if-nez p2, :cond_24

    new-instance p2, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {p2, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object p2, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 2
    :cond_24
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ばおぢでぎか:Lづざかべべ/のぷのちつ/てぜきぽく;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    invoke-virtual {p1, p2}, Lづざかべべ/のぷのちつ/てぜきぽく;->ぁごぐすすぃ(Ljava/lang/Object;)V

    goto :goto_39

    :cond_2c
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    .line 3
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    if-eqz p1, :cond_33

    goto :goto_34

    :cond_33
    const/4 v0, 0x0

    :goto_34
    if-nez v0, :cond_3a

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->えがぐせほち:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びえぁぜい;

    :goto_39
    return-void

    :cond_3a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ごづごきえ()Landroid/content/res/Resources;
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〱こか〺ぃせ()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public ごまけがぢは()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public ざっざへづ()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/Fragment;->こ〲しでおか:Ljava/lang/Object;

    if-ne v0, v2, :cond_10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->てぜきぽく()Ljava/lang/Object;

    goto :goto_11

    :cond_10
    move-object v1, v0

    :goto_11
    return-object v1
.end method

.method public ざとぅぼこ〺()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/Fragment;->こ〲しでおか:Ljava/lang/Object;

    if-ne v0, v2, :cond_10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->へぬ〴づぞ()Ljava/lang/Object;

    goto :goto_11

    :cond_10
    move-object v1, v0

    :goto_11
    return-object v1
.end method

.method public じぜこほぱ(Landroid/os/Bundle;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public final ずまげせび〳()Landroid/view/View;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_5

    return-object v0

    .line 2
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public せづっ〸ちね(Landroid/os/Bundle;)V
    .registers 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    if-eqz p1, :cond_17

    const-string v1, "android:support:fragments"

    .line 1
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_17

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v1, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->にぢ〱ぁな(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻()V

    .line 2
    :cond_17
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    iget v1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇぬぎばつ:I

    if-lt v1, v0, :cond_1e

    goto :goto_1f

    :cond_1e
    const/4 v0, 0x0

    :goto_1f
    if-nez v0, :cond_24

    .line 4
    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻()V

    :cond_24
    return-void
.end method

.method public ち〴みぎ〻び()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public ておぞぞはね()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public てぜきぽく()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public でどあくず()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public どぇぞほだ()Z
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->ぺふねづ〺:Z

    return v0
.end method

.method public な〱ちぉじ(Z)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->ぺふねづ〺:Z

    return-void
.end method

.method public ながふずは(Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .registers 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-nez p2, :cond_9

    const/4 p2, 0x0

    goto :goto_b

    .line 1
    :cond_9
    iget-object p2, p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:Landroid/app/Activity;

    :goto_b
    if-eqz p2, :cond_12

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 3
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    :cond_12
    return-void
.end method

.method public final なぎぱいぢぎ()Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごまけがぢは:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    return-object v0
.end method

.method public final なぶひせが()Z
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->てぜきぽく:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public のね〱ばぁぢ(Landroid/view/Menu;)Z
    .registers 4

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_15

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->どぇぞほだ:Z

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぅみぱぎぎ:Z

    if-eqz v0, :cond_e

    const/4 v1, 0x1

    :cond_e
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->げがぴうあだ(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_15
    return v1
.end method

.method public のびぶけせ(I)V
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_7

    if-nez p1, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->びぐびあび:I

    return-void
.end method

.method public のぷのちつ()V
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_1f

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺづげぺが:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;

    .line 2
    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/のぷのちつ/は〲ぱなで;

    if-nez v1, :cond_1e

    new-instance v1, Lづざかべべ/のぷのちつ/は〲ぱなで;

    invoke-direct {v1}, Lづざかべべ/のぷのちつ/は〲ぱなで;-><init>()V

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    return-object v1

    .line 3
    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public はつきどっ(Landroid/animation/Animator;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->〺つふすそ:Landroid/animation/Animator;

    return-void
.end method

.method public ばおぢでぎか()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    return-void
.end method

.method public final びえぁぜい()V
    .registers 3

    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    new-instance v0, Lづざかべべ/ぉざぅち〻/〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/ぉざぅち〻/〺つふすそ;-><init>(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V

    .line 2
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->ごまけがぢは:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1e

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    new-instance v1, Landroidx/fragment/app/Fragment$2;

    invoke-direct {v1, p0}, Landroidx/fragment/app/Fragment$2;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    :cond_1e
    return-void
.end method

.method public final びぐびあび()Landroidx/fragment/app/FragmentActivity;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_a

    .line 1
    :cond_6
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:Landroid/app/Activity;

    .line 2
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    :goto_a
    return-object v0
.end method

.method public びちづぼぬ(Z)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->けときぜと:Z

    const/4 v1, 0x3

    if-nez v0, :cond_1e

    if-eqz p1, :cond_1e

    iget v0, p0, Landroidx/fragment/app/Fragment;->〺つふすそ:I

    if-ge v0, v1, :cond_1e

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_1e

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->なぶひせが()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぃぜぶの〸ぃ:Z

    if-eqz v0, :cond_1e

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のびぶけせ(Landroidx/fragment/app/Fragment;)V

    :cond_1e
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->けときぜと:Z

    iget v0, p0, Landroidx/fragment/app/Fragment;->〺つふすそ:I

    if-ge v0, v1, :cond_28

    if-nez p1, :cond_28

    const/4 v0, 0x1

    goto :goto_29

    :cond_28
    const/4 v0, 0x0

    :goto_29
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぷぞてのほき:Z

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->くし〴〺ぅ:Landroid/os/Bundle;

    if-eqz v0, :cond_35

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->づざかべべ:Ljava/lang/Boolean;

    :cond_35
    return-void
.end method

.method public ぶでにく〼〳()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget-object v0, v0, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->ぺぁあねじ:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/Fragment;->こ〲しでおか:Ljava/lang/Object;

    if-ne v0, v2, :cond_10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->でどあくず()Ljava/lang/Object;

    goto :goto_11

    :cond_10
    move-object v1, v0

    :goto_11
    return-object v1
.end method

.method public ぷぞてのほき(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .registers 3

    return-void
.end method

.method public へぬ〴づぞ()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public final ぺぁあねじ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 4

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " has not been attached yet."

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぺがぅす〹ち()V
    .registers 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ざっざへづ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ごづごきえ()V

    return-void
.end method

.method public ぺづげぺが(IILandroid/content/Intent;)V
    .registers 4

    return-void
.end method
