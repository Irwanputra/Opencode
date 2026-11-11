.class public Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/bottomappbar/BottomAppBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 7

    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 1
    iget-boolean p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->のね〱ばぁぢ:Z

    if-eqz p3, :cond_c

    .line 2
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result p3

    .line 3
    iput p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->〴ねぷぐくぼ:I

    .line 4
    :cond_c
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 5
    iget-boolean p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->くねねぱす〻:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_28

    .line 6
    iget p1, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱かけばぜぐ:I

    .line 7
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result p3

    if-eq p1, p3, :cond_1e

    const/4 p1, 0x1

    goto :goto_1f

    :cond_1e
    const/4 p1, 0x0

    :goto_1f
    iget-object p3, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v2

    .line 8
    iput v2, p3, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱かけばぜぐ:I

    goto :goto_29

    :cond_28
    const/4 p1, 0x0

    .line 9
    :goto_29
    iget-object p3, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 10
    iget-boolean v2, p3, Lcom/google/android/material/bottomappbar/BottomAppBar;->〱こか〺ぃせ:Z

    if-eqz v2, :cond_42

    .line 11
    iget p3, p3, Lcom/google/android/material/bottomappbar/BottomAppBar;->はつきどっ:I

    .line 12
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v2

    if-eq p3, v2, :cond_38

    goto :goto_39

    :cond_38
    const/4 v0, 0x0

    :goto_39
    iget-object p3, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v1

    .line 13
    iput v1, p3, Lcom/google/android/material/bottomappbar/BottomAppBar;->はつきどっ:I

    move v1, v0

    :cond_42
    if-nez p1, :cond_46

    if-eqz v1, :cond_60

    .line 14
    :cond_46
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 15
    iget-object p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->ばおぢでぎか:Landroid/animation/Animator;

    if-eqz p3, :cond_4f

    invoke-virtual {p3}, Landroid/animation/Animator;->cancel()V

    :cond_4f
    iget-object p1, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->えがぐせほち:Landroid/animation/Animator;

    if-eqz p1, :cond_56

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    .line 16
    :cond_56
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 17
    invoke-virtual {p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->けときぜと()V

    .line 18
    iget-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$くし〴〺ぅ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 19
    invoke-virtual {p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぷぞてのほき()V

    :cond_60
    return-object p2
.end method
