.class public Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/lang/CharSequence;

.field public ぁごぐすすぃ:Lcom/google/android/material/tabs/TabLayout$TabView;

.field public くし〴〺ぅ:Ljava/lang/CharSequence;

.field public げつ〴ぬぐ:Landroid/graphics/drawable/Drawable;

.field public づざかべべ:Landroid/view/View;

.field public なぎぱいぢぎ:Lcom/google/android/material/tabs/TabLayout;

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->ぁごぐすすぃ:Lcom/google/android/material/tabs/TabLayout$TabView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout$TabView;->〳ぜぞぜべっ()V

    :cond_7
    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->ぁごぐすすぃ:Lcom/google/android/material/tabs/TabLayout$TabView;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_13
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->〺つふすそ:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$ぁごぐすすぃ;->〺つふすそ()V

    return-object p0
.end method
