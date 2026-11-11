.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static てぜきぽく:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

.field public static ぺふねづ〺:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Landroid/view/View;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public final くし〴〺ぅ:Ljava/lang/CharSequence;

.field public final づざかべべ:Ljava/lang/Runnable;

.field public final なぎぱいぢぎ:Ljava/lang/Runnable;

.field public final びぐびあび:I

.field public ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->づざかべべ:Ljava/lang/Runnable;

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき$〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき$〺つふすそ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->なぎぱいぢぎ:Ljava/lang/Runnable;

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->くし〴〺ぅ:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 1
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/は〲ぱなで;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2a

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledHoverSlop()I

    move-result p2

    goto :goto_30

    :cond_2a
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    .line 2
    :goto_30
    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->びぐびあび:I

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->げつ〴ぬぐ()V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    return-void
.end method

.method public static くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V
    .registers 4

    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺふねづ〺:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    if-eqz v0, :cond_b

    .line 1
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->づざかべべ:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    :cond_b
    sput-object p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺふねづ〺:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    if-eqz p0, :cond_1b

    .line 3
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget-object p0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->づざかべべ:Ljava/lang/Runnable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1b
    return-void
.end method


# virtual methods
.method public onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 6

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    const/4 v0, 0x0

    if-eqz p1, :cond_a

    iget-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->いいにぽつ:Z

    if-eqz p1, :cond_a

    return v0

    :cond_a
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "accessibility"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_25

    return v0

    :cond_25
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v1, 0x7

    if-eq p1, v1, :cond_38

    const/16 p2, 0xa

    if-eq p1, p2, :cond_31

    goto :goto_72

    :cond_31
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->げつ〴ぬぐ()V

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ()V

    goto :goto_72

    :cond_38
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_72

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    if-nez p1, :cond_72

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iget v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぁごぐすすぃ:I

    sub-int v1, p1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->びぐびあび:I

    if-gt v1, v2, :cond_68

    iget v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〳ぜぞぜべっ:I

    sub-int v1, p2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->びぐびあび:I

    if-gt v1, v2, :cond_68

    const/4 p1, 0x0

    goto :goto_6d

    :cond_68
    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぁごぐすすぃ:I

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〳ぜぞぜべっ:I

    const/4 p1, 0x1

    :goto_6d
    if-eqz p1, :cond_72

    .line 2
    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V

    :cond_72
    :goto_72
    return v0
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〳ぜぞぜべっ:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->びぐびあび(Z)V

    return p1
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ()V

    return-void
.end method

.method public 〺つふすそ()V
    .registers 3

    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->てぜきぽく:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    const/4 v1, 0x0

    if-ne v0, p0, :cond_18

    sput-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->てぜきぽく:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ()V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->げつ〴ぬぐ()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_18
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺふねづ〺:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    if-ne v0, p0, :cond_1f

    invoke-static {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V

    :cond_1f
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->なぎぱいぢぎ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final げつ〴ぬぐ()V
    .registers 2

    const v0, 0x7fffffff

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぁごぐすすぃ:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〳ぜぞぜべっ:I

    return-void
.end method

.method public びぐびあび(Z)V
    .registers 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_b

    return-void

    :cond_b
    const/4 v1, 0x0

    invoke-static {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;)V

    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->てぜきぽく:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ()V

    :cond_16
    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->てぜきぽく:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;

    move/from16 v1, p1

    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->いいにぽつ:Z

    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;

    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->ぁごぐすすぃ:I

    iget v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〳ぜぞぜべっ:I

    iget-boolean v5, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->いいにぽつ:Z

    iget-object v6, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->くし〴〺ぅ:Ljava/lang/CharSequence;

    .line 1
    iget-object v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v7, :cond_3f

    const/4 v7, 0x1

    goto :goto_40

    :cond_3f
    const/4 v7, 0x0

    :goto_40
    if-eqz v7, :cond_45

    .line 2
    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ()V

    :cond_45
    iget-object v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->くし〴〺ぅ:Landroid/widget/TextView;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->びぐびあび:Landroid/view/WindowManager$LayoutParams;

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v7

    iput-object v7, v6, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    iget-object v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v10, Lづざかべべ/〺つふすそ/びぐびあび;->tooltip_precise_anchor_threshold:I

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v10

    const/4 v11, 0x2

    if-lt v10, v7, :cond_66

    goto :goto_6b

    :cond_66
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v3

    div-int/2addr v3, v11

    :goto_6b
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v10

    if-lt v10, v7, :cond_81

    iget-object v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v10, Lづざかべべ/〺つふすそ/びぐびあび;->tooltip_precise_anchor_extra_offset:I

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    add-int v10, v4, v7

    sub-int/2addr v4, v7

    goto :goto_86

    :cond_81
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v10

    const/4 v4, 0x0

    :goto_86
    const/16 v7, 0x31

    iput v7, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    if-eqz v5, :cond_95

    sget v12, Lづざかべべ/〺つふすそ/びぐびあび;->tooltip_y_offset_touch:I

    goto :goto_97

    :cond_95
    sget v12, Lづざかべべ/〺つふすそ/びぐびあび;->tooltip_y_offset_non_touch:I

    :goto_97
    invoke-virtual {v7, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    .line 4
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v12

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    instance-of v14, v13, Landroid/view/WindowManager$LayoutParams;

    if-eqz v14, :cond_ae

    check-cast v13, Landroid/view/WindowManager$LayoutParams;

    iget v13, v13, Landroid/view/WindowManager$LayoutParams;->type:I

    if-ne v13, v11, :cond_ae

    goto :goto_cc

    :cond_ae
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    :goto_b2
    instance-of v14, v13, Landroid/content/ContextWrapper;

    if-eqz v14, :cond_cc

    instance-of v14, v13, Landroid/app/Activity;

    if-eqz v14, :cond_c5

    check-cast v13, Landroid/app/Activity;

    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v12

    invoke-virtual {v12}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v12

    goto :goto_cc

    :cond_c5
    check-cast v13, Landroid/content/ContextWrapper;

    invoke-virtual {v13}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v13

    goto :goto_b2

    :cond_cc
    :goto_cc
    if-nez v12, :cond_d0

    goto/16 :goto_159

    .line 5
    :cond_d0
    iget-object v13, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v12, v13}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget-object v13, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->づざかべべ:Landroid/graphics/Rect;

    iget v14, v13, Landroid/graphics/Rect;->left:I

    if-gez v14, :cond_104

    iget v13, v13, Landroid/graphics/Rect;->top:I

    if-gez v13, :cond_104

    iget-object v13, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const-string v14, "status_bar_height"

    const-string v15, "dimen"

    const-string v11, "android"

    invoke-virtual {v13, v14, v15, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    if-eqz v11, :cond_f6

    invoke-virtual {v13, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    goto :goto_f7

    :cond_f6
    const/4 v11, 0x0

    :goto_f7
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget-object v14, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->づざかべべ:Landroid/graphics/Rect;

    iget v15, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v14, v8, v11, v15, v13}, Landroid/graphics/Rect;->set(IIII)V

    :cond_104
    iget-object v11, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->ぁごぐすすぃ:[I

    invoke-virtual {v12, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v11, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->なぎぱいぢぎ:[I

    invoke-virtual {v2, v11}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v2, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->なぎぱいぢぎ:[I

    aget v11, v2, v8

    iget-object v13, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->ぁごぐすすぃ:[I

    aget v14, v13, v8

    sub-int/2addr v11, v14

    aput v11, v2, v8

    aget v11, v2, v9

    aget v13, v13, v9

    sub-int/2addr v11, v13

    aput v11, v2, v9

    aget v2, v2, v8

    add-int/2addr v2, v3

    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    move-result v3

    const/4 v11, 0x2

    div-int/2addr v3, v11

    sub-int/2addr v2, v3

    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget-object v3, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v3, v2, v2}, Landroid/view/View;->measure(II)V

    iget-object v2, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget-object v3, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->なぎぱいぢぎ:[I

    aget v8, v3, v9

    add-int/2addr v8, v4

    sub-int/2addr v8, v7

    sub-int/2addr v8, v2

    aget v3, v3, v9

    add-int/2addr v3, v10

    add-int/2addr v3, v7

    if-eqz v5, :cond_14b

    if-ltz v8, :cond_154

    goto :goto_157

    :cond_14b
    add-int/2addr v2, v3

    iget-object v4, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-gt v2, v4, :cond_157

    :cond_154
    iput v3, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_159

    :cond_157
    :goto_157
    iput v8, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 6
    :goto_159
    iget-object v2, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->げつ〴ぬぐ:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    iget-object v3, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->〺つふすそ:Landroid/view/View;

    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/けときぜと;->びぐびあび:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v2, v3, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->いいにぽつ:Z

    if-eqz v1, :cond_176

    const-wide/16 v1, 0x9c4

    goto :goto_18a

    :cond_176
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざっざへづ(Landroid/view/View;)I

    move-result v1

    and-int/2addr v1, v9

    if-ne v1, v9, :cond_182

    const-wide/16 v1, 0xbb8

    goto :goto_184

    :cond_182
    const-wide/16 v1, 0x3a98

    :goto_184
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    :goto_18a
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->なぎぱいぢぎ:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->〺つふすそ:Landroid/view/View;

    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぷぞてのほき;->なぎぱいぢぎ:Ljava/lang/Runnable;

    invoke-virtual {v3, v4, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
